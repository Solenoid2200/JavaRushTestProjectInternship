DROP DATABASE IF EXISTS test;
CREATE DATABASE IF NOT EXISTS test CHARACTER SET utf8 COLLATE utf8_general_ci;

USE test;

DROP TABLE IF EXISTS note;
CREATE TABLE note
(
        noteid int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
        notenote varchar(100),
        notedone tinyint(4),
        notedate timestamp(4)
);
CREATE UNIQUE INDEX noteid_UNIQUE ON note (noteid);

INSERT INTO note (noteid, notenote, notedone, notedate) VALUES (1, 'Решить стать программистом', 1, '2013-09-01 11:32:01');
INSERT INTO note (noteid, notenote, notedone, notedate) VALUES (2, 'Выбрать самый лучший язык программирования', 1, '2013-10-02 15:02:45');
INSERT INTO note (noteid, notenote, notedone, notedate) VALUES (3, 'Найти самый лучший курс для изучения Java', 1, '2013-11-09 05:21:07');
INSERT INTO note (noteid, notenote, notedone, notedate) VALUES (4, 'Начать заниматься на JavaRush', 1, '2013-12-07 17:38:41');
INSERT INTO note (noteid, notenote, notedone, notedate) VALUES (5, 'Пройти первый уровень', 1, '2014-01-17 09:08:49');
INSERT INTO note (noteid, notenote, notedone, notedate) VALUES (6, 'Пройти 10 уровней', 1, '2014-10-07 13:22:57');
INSERT INTO note (noteid, notenote, notedone, notedate) VALUES (7, 'Купить платную подписку', 1, '2014-12-25 12:12:12');
INSERT INTO note (noteid, notenote, notedone, notedate) VALUES (8, 'Начать дополнительно заниматься на Intuit', 1, '2015-01-02 15:02:45');
INSERT INTO note (noteid, notenote, notedone, notedate) VALUES (9, 'Регулярно заниматься на Intuit', 0, '2015-11-09 07:28:17');
INSERT INTO note (noteid, notenote, notedone, notedate) VALUES (10, 'Пройти 20 уровней', 1, '2015-12-07 17:38:41');
INSERT INTO note (noteid, notenote, notedone, notedate) VALUES (11, 'Купить книгу "Философия Java"', 1, '2016-01-05 22:22:14');
INSERT INTO note (noteid, notenote, notedone, notedate) VALUES (12, 'Прочитать книгу "Философия Java"', 0, '2016-04-09 17:12:57');
INSERT INTO note (noteid, notenote, notedone, notedate) VALUES (13, 'Пройти 25 уровней', 1, '2017-02-01 16:24:05');
INSERT INTO note (noteid, notenote, notedone, notedate) VALUES (14, 'Купить ещё книг по Java', 1, '2017-03-003 15:02:45');
INSERT INTO note (noteid, notenote, notedone, notedate) VALUES (15, 'Прочитать ещё одну книгу', 0, '2017-04-09 05:21:07');
INSERT INTO note (noteid, notenote, notedone, notedate) VALUES (16, 'Начать изучать SQL', 1, '2017-05-07 17:38:41');
INSERT INTO note (noteid, notenote, notedone, notedate) VALUES (17, 'Изучить SQL хорошо', 0, '2017-06-08 09:08:49');
INSERT INTO note (noteid, notenote, notedone, notedate) VALUES (18, 'Поработать с Eclipse', 1, '2017-07-07 13:22:57');
INSERT INTO note (noteid, notenote, notedone, notedate) VALUES (19, 'Регулярно смотреть видео по Java', 0, '2017-08-25 12:12:12');
INSERT INTO note (noteid, notenote, notedone, notedate) VALUES (20, 'Пройти 26 уровень', 1, '2017-01-02 15:02:45');
INSERT INTO note (noteid, notenote, notedone, notedate) VALUES (21, 'Пройти 27 уровень', 1, '2017-02-09 07:28:17');
INSERT INTO note (noteid, notenote, notedone, notedate) VALUES (22, 'Пройти 28 уровень', 1, '2017-03-07 17:38:41');
INSERT INTO note (noteid, notenote, notedone, notedate) VALUES (23, 'Пройти 29 уровень', 1, '2017-04-05 22:22:14');
INSERT INTO note (noteid, notenote, notedone, notedate) VALUES (24, 'Пройти 30 уровень', 1, '2017-05-09 17:12:57');
INSERT INTO note (noteid, notenote, notedone, notedate) VALUES (25, 'Пройти 31 уровень', 1, '2017-06-02 15:02:45');
INSERT INTO note (noteid, notenote, notedone, notedate) VALUES (26, 'Пройти 32 уровень', 1, '2017-07-09 07:28:17');
INSERT INTO note (noteid, notenote, notedone, notedate) VALUES (27, 'Пройти 33 уровень', 1, '2017-08-07 17:38:41');
INSERT INTO note (noteid, notenote, notedone, notedate) VALUES (28, 'Пройти 34 уровень', 1, '2017-09-05 22:22:14');
INSERT INTO note (noteid, notenote, notedone, notedate) VALUES (29, 'Выйти на 35 уровень', 1, '2017-10-09 17:12:57');
INSERT INTO note (noteid, notenote, notedone, notedate) VALUES (30, 'Выполнить тестовое задание дла прохождения стажировки на JavaRush', 0, '2018-05-20 16:24:05');
INSERT INTO note (noteid, notenote, notedone, notedate) VALUES (31, 'Пройти стажировку на JavaRush', 0, '2018-05-29 15:02:45');
INSERT INTO note (noteid, notenote, notedone, notedate) VALUES (32, 'Пройти 40 уровень', 0, '2018-05-30 05:21:07');
INSERT INTO note (noteid, notenote, notedone, notedate) VALUES (33, 'Стать настоящим программистом', 0, '2018-05-31 08:13:30');
