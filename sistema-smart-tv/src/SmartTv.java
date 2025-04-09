public class SmartTv {
    private boolean ligada = false;
    private int canal = 0;
    private int volume = 25;

    public boolean ligarTv(){
        return this.ligada = true;
    }

    public void proximoCanal(){
        this.canal++;
    }

    public void voltarCanal(){
        this.canal--;
    }

    public int escolherCanal(int canal){
        return this.canal = canal;
    }

    public void aumentarVolume(){
        this.volume++;
    }

    public void diminuirVolume(){
        this.volume--;
    }

    public boolean getLigada() {
        return ligada;
    }

    public int getCanal() {
        return canal;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "SmartTv{" +
                "ligada=" + ligada +
                ", canal=" + canal +
                ", volume=" + volume +
                '}';
    }
}
