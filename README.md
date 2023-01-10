# Exceptions
> 예외 항목 관리
> - ## ErrorsSerializer
>> 전역에서 발생할 수 있는 예외를 반환할 때 반환되는 형식을 작성한 Class
> - ## model.ErrorModel
>> 전역에서 발생할 수 있는 예외를 반환할 때 반환되는 형식을 정의한 Class
> - ## exception
>> 제공되는 예외 항목 외에 자주 사용하는 예외 항목 정의
>> - ### exception.DuplicateException
>>> 중복 예외 class
>> - ### exception.ParameterException
>>> parameter 예외 class
>> - ### exception.UnAuthenticatedException
>>> 인증 예외 class
> - ## enumeration.StatusEnum
>> 제공되는 예외 항목과 정의한 예외 항목에 대해  
>> 에러 반환에 필요한 정보의 기본값을 정의
> - ## properties.ExceptionsProperties
>> 프로젝트에 따라 변경되는 예외 항목의 정보를 변경할 수 있는 Properties 정의  
>> 프로젝트에서 사용할 때에는 application.yml 에서 각 정보를 변경할 수 있다.
>> ``` yaml
>> freshr:
>>   exception:
>>       un-authenticated-status: unauthorized
>>       un-authenticated-message: "처리되었습니다."
>>       un-authenticated-code: "UAERROR"
>> ```
>> 위처럼 변경하면 ExceptionsResponse 에 설정된다.  
>> ExceptionsProperties 에서는 lowerCameCase 형식이었지만  
>> application.yml 에서는 lower-hypen 으로 작성된다.
> - ## config.ExceptionsConfiguration
>> enumeration.StatusEnum 과 properties.ExceptionsProperties 에 설정한 값으로 response.ExceptionsResponse 를 빌드한다.
> - ## response.ExceptionsResponse
>> enumeration.StatusEnum 과 properties.ExceptionsProperties 에 설정한 값으로 빌드되는 Class.  
>> 이 Class 를 프로젝트에서 가져다 사용한다.