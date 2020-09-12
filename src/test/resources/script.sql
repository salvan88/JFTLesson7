INSERT INTO
    library.author(id, name)
    VALUES
           (1, 'Мозайкин Геннадий'),
           (2, 'Домоседова Ольга'),
           (3, 'Котов Евгений'),
           (4, 'Домостроев Николай'),
           (5, 'Кулинарова Яна');

INSERT INTO
    library.user(id, name)
    VALUES
           (1, 'Михаил'),
           (2, 'Яна'),
           (3, 'Софья'),
           (4, 'Павел'),
           (5, 'Пётр');

INSERT INTO
    library.book(id, name, authorId, userId)
    VALUES
           (1, 'Как не отравить мужа?', 5, 2),
           (2, 'Строим правильно', 4, 1),
           (3, 'Кладём плитку надолго', 1, 3),
           (4, 'Зарабатываем на дому', 2, 3),
           (5, 'Как гладить кота правильно?', 3, 5),
           (6, 'Как срубить избу?', 4, 1),
           (7, 'Как всё успевать?', 2, 2),
           (8, 'Как чесать коту пузо?', 3, 4);



