# Тестовый проект RestAssured+Maven+Java

#### Класс JsonCreate.java - примеры создания JSON
    Методы:
    createJsonUnderscore()
	createJsonObject()
	createJsonText()

#### Класс CreateDogsTest.java - примеры простого теста POST - запросов
	Информация: Все тесты работают с сайтом https://petstore.swagger.io/#/
    Тесты:
    createDogAndCheck() - создание питомца и проверка ответа
	createDogAndGetTag() - создание питомца и получение значение тега из ответа

#### Класс GetDogsTest.java - примеры простого теста GET - запросов
	Информация: Все тесты работают с сайтом https://petstore.swagger.io/#/
    Тесты:
    getDogAndCheck() - запрос питомца и проверка ответа и значений
	getDogString() - запрос питомца и получение значение тега из ответа
	getDogMap() - запрос питомца и получение значение объекта из ответа с помощью groovy
	
#### Класс BaseExpendTest.java - пример настройки Спецификации для методов в классе CreateGetExpendTest.java
	Методы:
    beforeRest() - настройки для request и response
	
#### Класс CreateGetExpendTest.java - примеры простого теста POST и GET - запросов
	Информация: Все тесты работают с сайтом https://petstore.swagger.io/#/
    Тесты:
    createDog() - создание питомца
	getDog() - запрос питомца
