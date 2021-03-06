package fr.lernejo;
    import org.assertj.core.api.Assertions;
    import org.junit.jupiter.api.Test;

class SampleTest {
    @Test
    void ADD(){
        int a = 5;
        int b = 9;
        int res= new Sample().op(Sample.Operation.ADD, a, b);
        Assertions.assertThat(res).isEqualTo(14);
    }
    @Test
    void MULT(){
        int a = 5;
        int b = 9;
        int res= new Sample().op(Sample.Operation.MULT, a, b);
        Assertions.assertThat(res).isEqualTo(45);
    }

}
