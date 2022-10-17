# CSCB869 Java Web Services

## Задание за разработване на проект

## Обслужване на МПС

**Задание:** Проектът за обслужване на МПС изисква да се реализира процесът на запазване и
показване на детайлите по обслужване на клиентите на сервизи, които извършват услуги за
ремонт и обслужване на МПС. Сервизите могат да извършват различни видове услуги,
например: по ходовата част, по двигателя, по спирачната система, за смяна на консумативи и
т.н. За да могат да извършват тези услуги, в сервизите трябва да работят служители с дадената
квалификация. Освен това е възможно някои от сервизите да работя само с определена марка
МПС. Клиентите на сервизите предварително си запазват час за обслужване на техните МПС,
като първо избират сервиза, в който искат да бъдат обслужени. За всяко МПС трябва да се пази
информация за регистрационния номер, марка, модел и година на производство. При
посещение в сервиза се пази информация за това на кой автомобил е извършено обслужване и
колко е цената, която е платил клиентът. Всеки служител на сервиз може да види историята на
всяко обслужено МПС, в сервиза, в който той работи и обобщени данни за броя на
извършените услуги по категории, по марка МПС и по година на производство. Всеки клиент
може да види историята на обслужването на неговите МПС във всички сервизи.

Да се разработи уеб приложение със Spring Boot, което е базирано на RESTful услуги, има база
от данни и потребителски интерфейс. Приложението трябва да осигурява възможност за
въвеждане, редактиране, изтриване и визуализиране на данните за описаните по-горе МПС,
техните собственици и сервизите за обслужване на МПС и техните служители. Необходимо е да
се реализират unit и integration тестове (80 % покритие).