class Dado {
    private double faturamento;
    private int dia;

    public Dado(){

    }



    public double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(double faturamento) {
        this.faturamento = faturamento;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "Dado {" +
                "faturamento = " + faturamento +
                ", dia = " + dia +
                " }";
    }
}