1. Тестовое задание для поступления на Летнюю онлайн-стажировку JavaRush 2018

2. Задача

	Требуемые технологии:

		Maven 3 (v.3.3.9) (для сборки проекта);
		Tomcat8 (для тестирования своего приложения);
		Spring (версия не ниже 4.3.0.RELEASE);
		Hibernate (версия не ниже 5.2.1.Final);
		MySQL (база данных).
		
		Frontend: Spring MVC, или Angular, или Vaadinor, или ZK framework;

    Для упрощения тестирования называйте все свою базу test, с логином и паролем root(нам не нужно будет для тестирования создавать кучу лишних и ненужных баз);
	Результат выложить на GitHub или Bitbucket.
	Версии можно смело брать самые последние. Конфликтов быть не должно.

	Задание NOTES:

		Реализовать простенькое приложение Notes-list, для отображения списка заметок.
		Нужно показывать список уже созданных заметок(с пейджингомпо 10 заметокна странице). Каждуюиз них можно редактировать, добавлять новые, отмечать как «Выполнено», удалять. Список можно фильтровать как «Все заметки», «Только невыполненные», «Выполненные».
		Заметки хранить в базе. Схему таблички для хранения нужно придумать самому (можно ограничиться одной таблицей).
		Бизнес-требование: кроме фильтрации должна быть возможность сортировки заметокпо дате создания (например, поле createdDateв БД). Тип поля – DATE или DATETIME, или TIMESTAMP.
		
3. Запуск проекта

	A. Установить и настроить :  MySQL , MySQL Workbench (optional) 
	B. Создать базу данных в MySQL и назвать её: test, с логином: root и паролем: root
	C. Клонировать проект с Github: https://github.com/Solenoid2200/solenoid
	D. Подключить к проекту SDK ( IDEA --> File --> Project Structure --> Project Settings --> Project --> Project SDK: ... )
	E. Создать и заполнить таблицу в базе данных. Использовать для этого файл с SQL-скриптом: create_db.sql ( Project --> JavaRushTestProjectInternship --> src --> main --> resources --> static --> create_db.sql )
	F. Запустить в IDEA проект на выполнение ( Run )
	G. Открыть в браузере страницу по адресу: localhost:8080
	H. Пользоваться готовым приложением

4. README.md

    1. Project --> JavaRushTestProjectInternship --> src --> main --> resources --> static --> readme.txt
    2. Project --> JavaRushTestProjectInternship --> src --> main --> resources --> static --> create_db.sql
    3. Запуск проекта

    	A. Установить и настроить :  MySQL , MySQL Workbench (optional)
    	B. Создать базу данных в MySQL и назвать её: test, с логином: root и паролем: root
    	C. Клонировать проект с Github: https://github.com/Solenoid2200/JavaRushProjectInternship
    	D. Подключить к проекту SDK ( IDEA --> File --> Project Structure --> Project Settings --> Project --> Project SDK: ... )
    	E. Создать и заполнить таблицу в базе данных. Использовать для этого файл с SQL-скриптом: create_db.sql ( Project --> JavaRushTestProjectInternship --> src --> main --> resources --> static --> create_db.sql )
    	F. Запустить в IDEA проект на выполнение ( Run )
    	G. Открыть в браузере страницу по адресу: localhost:8080
    	H. Пользоваться готовым приложением