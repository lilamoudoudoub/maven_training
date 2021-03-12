package fr.lernejo;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
class SampleTest {
    @Test

    void mult_behaves_as_expected() {
        int result= new Sample().op(Sample.Operation.MULT, 6, 2);
        Assertions.assertThat(result).isEqualTo(12);
    }
    @Test
    void add_behaves_as_expected() {
        int result= new Sample().op(Sample.Operation.ADD, 5, 2);
        Assertions.assertThat(result).isEqualTo(7);
    }


}
