public class TesteTributaveis {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(22,33);
        cc.deposita(100);

        SeguroDeVida sv = new SeguroDeVida();

        CalculadorImpostos calc = new CalculadorImpostos();
        calc.registra(cc);
        calc.registra(sv);


        System.out.println(calc.getTotalImposto());
    }
}
