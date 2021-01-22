// preciso do ID da comunidade global para várias funções
var IDCom;

// preciso tb do percentual de conclusão e tb do numero de ocorrencias
var pConclusao;
var numOcorrencias;


function carregaInfo() {
    var userSTR = localStorage.getItem("userMod");
    if (!userSTR) {
        window.location = "index.html";
        return;
    }

    // preciso recuperar o ID da comunidade que veio na URL
    var str = window.location.search;
    console.log(str);
    var idComunidade = str.substr(4);
    console.log("ID da comunidade = " + idComunidade);

    IDCom = parseInt(idComunidade); // já atribuí e converti para inteiro


    fetch("http://localhost:8088/comunidades/" + IDCom)
        .then(res => res.json())
        .then(comunidade => document.getElementById("nomeComunidade").innerHTML = comunidade.nome);

    /*
     Como eu leio o fetch?
     res = fetch("http://localhost:8088/comunidades/"+IDCom)
     comunidade = res.json();
     document.getElementById("nomeComunidade").innerHTML = comunidade.nome;
    */

}

function cadastrar() {
    var txtData = document.getElementById("txtData").value;
    var txtDescricao = document.getElementById("txtDescricao").value;
    var txtPercentual = document.getElementById("txtPercentual").value;

    if (numOcorrencias > 0 || parseFloat(txtPercentual) + parseFloat(pConclusao) > 100) {
        document.getElementById("msgStatus").innerHTML = "Já existem ocorrências para o mês ou o percentual total excede 100%";
        return;
    }

    var msgBody = {
        data: txtData,
        descricao: txtDescricao,
        percentual: parseFloat(txtPercentual),
        comunidade: {
            id: IDCom
        }
    }

    var cabecalho = {
        method: "POST",
        body: JSON.stringify(msgBody),
        headers: {
            "content-type": "application/json"
        }
    }

    fetch("http://localhost:8088/modernizacao/nova", cabecalho)
        .then(res => {
            if (res.status == 201) {
                alert("Item de modernizacao cadastrado com sucesso!");
            }
            else {
                alert("Erro ao gravar item de modernizacao");
            }
        });

}
function pesquisar() {
    // idéia: buscar o id da comunidade + a data de cadastro e ir até o backend e buscar
    // as restricoes

    var txtData = document.getElementById("txtData").value;

    fetch("http://localhost:8088/modernizacao/" + IDCom + "/" + txtData)
        .then(res => res.json())
        .then(objeto => {
            var txtRestricao = `${objeto.percentual}% concluido e ${objeto.quantidade} ocorrencias neste mes/ano`;
            document.getElementById("restricoes").innerHTML = txtRestricao;
            pConclusao = objeto.percentual;
            numOcorrencias = objeto.quantidade;
        });
}