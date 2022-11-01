package step3.domain.lotto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static step3.domain.lotto.LottoNumbers.DEFAULT_LOTTO_SIZE;
import static step3.type.ErrorMessageType.LOTTO_NUMBER_WRONG_SIZE;

class LottoNumbersTest {

    @Test
    @DisplayName("로또 번호가 6자리가 아니면 IllegalArgumentException이 발생한다.")
    void lottoWrongSize() {
        assertThatIllegalArgumentException()
                .isThrownBy(() ->
                        new LottoNumbers(Arrays.asList(1, 2, 3, 4, 5))
                )
                .withMessageContaining(LOTTO_NUMBER_WRONG_SIZE.getMessage());
    }

    @Test
    @DisplayName("6자리 지정 로또 번호를 생성한다.")
    void createFixedLottoNumbers() {
        LottoNumbers lottoNumbers = new LottoNumbers(Arrays.asList(1, 2, 3, 4, 5, 6));
        assertThat(lottoNumbers.value()).hasSize(DEFAULT_LOTTO_SIZE);
    }

    @Test
    @DisplayName("6자리 랜덤 로또 번호를 생성한다.")
    void createRandomLottoNumbers() {
        LottoNumbers lottoNumbers = new LottoNumbers();
        assertThat(lottoNumbers.value()).hasSize(DEFAULT_LOTTO_SIZE);
    }
}
