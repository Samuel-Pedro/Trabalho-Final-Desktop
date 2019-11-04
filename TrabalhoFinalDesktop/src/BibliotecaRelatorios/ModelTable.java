
package BibliotecaRelatorios;

import Principal.*;
import javafx.scene.control.Button;

public class ModelTable {
    String id,idAlunos,idAcervo,dataEmprestimo,dataPrevDevol,dataDevolucao,multa;

    
    Button deleta;

    public Button getDeleta() {
        return deleta;
    }

    public void setDeleta(Button deleta) {
        this.deleta = deleta;
    }

    

    public ModelTable(String id, String idAlunos, String idAcervo, String dataEmprestimo, String dataPrevDevol, String dataDevolucao, String multa, Button deleta){
        this.id = id;
        this.idAlunos = idAlunos;
        this.idAcervo = idAcervo;
        this.dataEmprestimo = dataEmprestimo;
        this.dataPrevDevol = dataPrevDevol;
	this.dataDevolucao = dataDevolucao;
        this.multa = multa;
        
        this.deleta = deleta;
        this.deleta.setId("deleta");
        
        
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getIdAlunos() {
	return idAlunos;
    }

    public void setIdAlunos(String idAlunos) {
	this.idAlunos = idAlunos;
    }

    public String getIdAcervo() {
	return idAcervo;
    }

    public void setIdAcervo(String idAcervo) {
	this.idAcervo = idAcervo;
    }

    public String getDataEmprestimo() {
	return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
	this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataPrevDevol() {
	return dataPrevDevol;
    }

    public void setDataPrevDevol(String dataPrevDevol) {
	this.dataPrevDevol = dataPrevDevol;
    }

    public String getDataDevolucao() {
	return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
	this.dataDevolucao = dataDevolucao;
    }

    public String getMulta() {
	return multa;
    }

    public void setMulta(String multa) {
	this.multa = multa;
    }
    
}
