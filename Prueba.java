package ProyectoPrueba;

public class Prueba {
    public static void main(String[] args) {
        Prueba p = new Prueba();
        p.imprimir();
    }

    private void imprimir() {
        System.out.println("Hola mundo");
        metodoIterativo();
    }

    private void metodoIterativo() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hola mundo "+i);
        }
    }
}