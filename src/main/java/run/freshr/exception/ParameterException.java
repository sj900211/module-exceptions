package run.freshr.exception;

import static run.freshr.enumeration.StatusEnum.PARAMETER;

/**
 * 파라미터 에러
 *
 * @author FreshR
 * @apiNote 파라미터 에러 정의
 * @since 2022. 12. 23. 오후 4:23:59
 */
public class ParameterException extends RuntimeException {

  /**
   * 기본 메시지
   *
   * @apiNote 기본 메시지 설정
   * @since 2022. 12. 23. 오후 4:23:59
   */
  private String message = PARAMETER.getMessage();

  /**
   * 생성자
   *
   * @apiNote 기본 생성자
   * @author FreshR
   * @since 2022. 12. 23. 오후 4:23:59
   */
  public ParameterException() {
  }

  /**
   * 생성자
   *
   * @param message 메시지
   * @apiNote 메시지 생성자
   * @author FreshR
   * @since 2022. 12. 23. 오후 4:23:59
   */
  public ParameterException(String message) {
    this.message = message;
  }

}
