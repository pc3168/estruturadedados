package br.com.pc.estruturadedados.fila;

public class Fila {

    private No refNoEntradaFila;

    public Fila(){
        this.refNoEntradaFila = null;
    }

    public void enqueue(No novoNO){
        novoNO.setReferenciaNo(refNoEntradaFila);
        refNoEntradaFila = novoNO;
    }

    public No primero(){
        if (!this.vazio()){
            No primeiroNo = refNoEntradaFila;
            while(true){
                if (primeiroNo.getReferenciaNo() != null){
                    primeiroNo  = primeiroNo.getReferenciaNo();
                }else{
                    break;
                }
            }
            return primeiroNo;
        }

        return null;
    }

    public No dequeue(){
        if(!this.vazio()){
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while (true){
                if(primeiroNo.getReferenciaNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getReferenciaNo();
                }else{
                    noAuxiliar.setReferenciaNo(null);
                    break;
                }
            }
            return primeiroNo;
        }
        return null;
    }

    public boolean vazio(){
        return refNoEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;

        if(refNoEntradaFila != null){
            while (true){
                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]--->";
                if(noAuxiliar.getReferenciaNo() != null){
                    noAuxiliar = noAuxiliar.getReferenciaNo();
                }else{
                    stringRetorno += "null";
                    break;
                }
            }
        }else{
            stringRetorno = "null";
        }
        return stringRetorno;
    }


}
