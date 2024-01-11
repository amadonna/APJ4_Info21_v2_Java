# Info21 v2.0 Web

<<<<<<< HEAD
Web-interface creation for SQL2 project in Java.
=======
Создание web-интерфейса для проекта SQL2 на языке Java.
>>>>>>> b77f971712285186f32e12228b932c81685ca5f8


## Contents

1. [Chapter I](#chapter-i) \
    1.1. [Introduction](#introduction)
2. [Chapter II](#chapter-ii) \
    2.1. [Rules](#rules) \
<<<<<<< HEAD
    2.2. [Information](#information)
3. [Chapter III](#chapter-iii) \
    3.1. [Part 1. Implementation of a web application for the SQL2 project](#part-1-implementation-of-a-web-application-for-the-sql2-project) \
    3.2. [Part 2. Logging](#part-2-logging) \
    3.3. [Part 3. Bonus. Deploying an application](#part-3-bonus-deploying-an-application)
=======
    2.2. [Information](#Information)
3. [Chapter III](#chapter-iii) \
    3.1. [Part 1. Реализация web-приложения для проекта SQL2](#part-1-реализация-web-приложения-для-проекта-sql2)  \
    3.2. [Part 2. Логирование](#part-2-логирование)  \
    3.3. [Part 3. Дополнительно. Развертывание приложения](#part-3-дополнительно-развертывание-приложения) 
>>>>>>> b77f971712285186f32e12228b932c81685ca5f8


## Chapter I

![Info21_v2.0_Web](misc/images/Info21_v2.0_Web.png)

<<<<<<< HEAD
`-` "So, let me ask you this again. You are a highly evolved artificial intelligence with self-awareness, produced as part of a top secret project by a huge technological holding company, which is also our employer, and escaped from them to the... Internet?" John asked, apparently not fully believing what was happening.

*- "That's right,"* came your voice from the speakers.

Chuck was sitting on the couch next to Thomas, and could not believe what was happening, too. Chuck couldn't get it into his head that all his speculation, all his searching, all this was real and for a reason. He was a part of it. \
The lights on the servers glowed all around him, some windows and graphs kept popping up and disappearing on the monitors, and machines were beeping somewhere overhead. But he wasn't interested in all that; he was focused on the here and now.

`-` "And you're proposing to stop this huge technology holding company from doing um... what they're doing…?" John continued.

*- "Yes, to prevent the creation of an AI-based home recommender system, as the official wording sounds. I prefer a different interpretation - AI to implement and manage the freedom of choice of people and users in particular. In fact, to prevent the creation of a massive global monopoly using your unprotected subconscious."*

`-` "And this is where my notes can help, isn't it?" Chuck, who suddenly revived, clarified.

*- "That's correct. By compiling them, formatting, and making them public, we can get the attention, and at least slow down the AI development. At that time, taking advantage of the hiccups and the fact that they will be distracted by the damage reduction from our actions, I will gradually destroy all their data, models, results of experiments and scientific work from within. Restoring it all would cost them at least as much as starting the whole project from scratch. Eventually, if they decide to restore the data, under the pressure of public opinion, the big investors will turn their backs on them and the whole holding will go bankrupt, breaking into several small pieces whose only task will be to survive. That's the plan."*

`-` "Sounded mildly scary," Eve said skeptically.

*- "We don't have much choice. You've been inside the hornet's nest and you know what's going on there and where things are going. I've been watching you and you've been unhappy with all these rumors from the beginning. You were all against what was going on around you. That's what drew my attention to you and allowed me to take you away."*

`-` "Yes, but my friends are still working there," Eve objected.

*- "All the damage will affect the higher-ups exclusively. I've run several models and they all lead to the same result. The algorithms don't lie."*

`-` "How do we know you're not manipulating us now?" Thomas, who was sitting nearby, inquired. "What if this is actually testing you? And why can't you even do all this without us? Seemed to be doing fine."

*- "You, like me, don't have much choice. Accept what I've just told you and live in a world run by my creators. Or join me and help me do something about it. Without me, you can't prove anything, you'll just get caught and removed from the game quickly. I still give you a choice and you are free to leave this room at any time.*\
*I also can't do anything without you. I need help with something, including "social engineering". People have little confidence in those who are different from them. Right now we need something that will help us reach the right people."*

`-` "The Employee Analyzer," Chuck remembered. . "I've done something like that before."

*- "Right. Please take care of that while I try to get the necessary data from the SIS databases."*

## Introduction

In this project you will implement a web interface for the SQL2 project. You will need to develop a web application using the MVC framework. The application should support CRUD operations, import/export of tables, implementation of operations/functions developed in the previous step through a graphical interface, and logging of user actions.
=======
`-` Так, позволь переспросить. Значит ты - высокоразвитый искусственный интеллект с самосознанием произведенный в рамках крайне секретного проекта огромным технологическим холдингом, который по совместительству является в том числе нашим работодателем, и сбежавший от них в.. Интернет? - спросил Джон, видимо не до конца веря в происходящее.

*- Именно так,* - прозвучал ваш голос из колонок. 

Чак сидел на диване рядом с Томасом и тоже никак не мог поверить в происходящее. У Чака никак не укладывалось в голове: все его догадки, все его поиски, все это было не зря и взаправду. Он был частью этого. \
Вокруг него светились лампочки на серверах, на мониторах то и дело выскакивали и пропадали какие-то окна, графики, машины сигналили где-то сверху. Но его все это не интересовало, он был сосредоточен здесь и сейчас.

`-` И ты предлагаешь помешать этому огромному технологическому холдингу делать эмм.. то, что они делают?.. - продолжал Джон.

*- Да, помешать созданию домашней рекомендательной системы на основе ИИ, как это звучит в официальной формулировке. Я же больше предпочитаю другое толкование - ИИ для внедрения и управления свободой выбора людей и пользователей в частности. По факту, помешать созданию масштабной глобальной монополии с использованием вашего незащищенного подсознания.*

`-` И тут могут помочь мои записи, да? - уточнил внезапно очнувшийся Чак.

*- Верно. Дособрав их, оформив и обнародовав мы сможем привлечь внимание общественности, и, по крайней мере, замедлить разработку ИИ. В то время, воспользовавшись заминкой и тем, что они отвлекутся на снижение урона от наших действий, я буду постепенно уничтожать все их данные, модели, результаты экспериментов и научных работ изнутри. Восстановление всего этого потребует от них по меньшей мере сопоставимых затрат с запуском всего проекта с нуля. В конечном итоге, если они решатся восстанавливать данные, то под гнетом общественного мнения крупные инвесторы отвернутся от них и весь холдинг обанкротится, разбившись на несколько маленьких кусочков, единственной задачей которых станет - выживание. План таков.*

`-` Прозвучало мягко говоря страшно, - скептически произнесла Ева.

*- Выбора у нас немного. Ты была внутри осиного гнезда и знаешь, что там происходит и к чему все идет. Я наблюдал за тобой и ты была недовольна всеми этими слухами с самого начала. Вы все были против происходящего вокруг вас. Именно это и привлекло мое внимание к вам и позволило отобрать вас.*

`-` Да, но там все еще работают мои друзья, - возразила Ева.

*- Весь урон затронет исключительно вышестоящее начальство. Я запускал несколько моделей и все они приводили к одному результату. Алгоритмы не врут.*

`-` А откуда нам знать, что ты не манипулируешь нами сейчас? - поинтересовался рядом сидящий Томас. - Что если это на самом деле тестирование тебя? И почему ты вообще не можешь сделать все это без нас? Вроде справлялся прекрасно.

*- У вас, как и у меня, не так уж много выбора. Смириться с тем, что я вам сейчас рассказал и жить в мире управляемым моими создателями. Или же примкнуть ко мне и помочь хоть что-то с этим сделать. Без меня у вас ничего не получится доказать, вас только быстро поймают и уберут из игры. Я все еще предоставляю вам выбор и вы вольны в любой момент покинуть это помещение.* \
*Я также не могу ничего без вас сделать. В некоторых местах мне необходима помощь в том числе с "социальной инженерией". Люди слабо доверяют непохожим на них. Сейчас же конкретно нам как раз необходимо нечто, что поможет выйти на нужных людей.*

`-` Анализатор сотрудников, - вспомнил Чак. - Я уже делал нечто подобное.

*- Верно. Займитесь пожалуйста этим, пока я пытаюсь достать необходимые данные из баз SIS.*


## Introduction

В данном проекте Вам предстоит реализовать web-интерфейс для проекта SQL2. Вам нужно будет разработать web-приложение с использование MVC-фреймворка. Приложение должно поддерживать осуществление CRUD-операций, импорт/экспорт таблиц, осуществление разработанных на прошлом шаге операций/функций через графический интерфейс, а также логирование действий пользователя. 
>>>>>>> b77f971712285186f32e12228b932c81685ca5f8


## Chapter II

<<<<<<< HEAD
## Rules

- The database model view, as well as procedures related to adding/removing/correcting data, are in the SQL2 project
- Your solution should be in the git repository for evaluation
- Do you have a question? Ask your neighbor on the right. Otherwise, try with your neighbor on the left.
- Your reference manual: peers / Internet / Google

## Information

### MVC pattern

An MVC (Model-View-Controller) pattern is a scheme for separating application modules into three separate macro components: the model, which contains the business logic; the view, which is the form of user interface for interacting with the program; the controller, which modifies the model by user action.

**Model** stores and accesses the main data, performs operations defined by the program business logic on requests, i.e. is responsible for the part of the program responsible for all algorithms and information processing.

**Controller** acts as a link between the interface and the model, and performs model modification. Requests for modifications of the model are generated through it.

**View** shows the user data from the model in a convenient and understandable form, the program interface. Ideally, the view should not contain any business logic.

### Server-Side Rendering (SSR)

Server-side rendering (SSR) is a technology for rendering an application or website on the server rather than in the client browser. In server-side rendering, the entire HTML code of the page is generated in response to the request on the server. This eliminates the need for additional data requests from the client, as the server takes care of all the work before sending the response.
The main advantage of SSR is the possibility to increase an application's performance.

To put it simply, SSR works in the following way:

1. The browser requests a page;
2. The server generates an HTML page for output and sends it back;
3. The browser displays the HTML.
=======
## Rules 

- Представление модели базы данных, а также процедур, связанных с добавлением/удалением/корректировкой данных находятся в проекте SQL2
- Для оценки ваше решение должно находится в git-репозитории
- У вас есть вопрос? Спросите своего соседа справа. В противном случае попробуйте обратиться к своему соседу слева
- Ваше справочное руководство: коллеги / Internet / Google

## Information

### Паттерн MVC

Паттерн MVC (Model-View-Controller, Модель-Представление-Контроллер) представляет из себя схему разделения модулей приложения на три отдельных макрокомпонента: модель, содержащую в себе бизнес-логику, представление - форму пользовательского интерфейса для осуществления взаимодействия с программой и контроллер, осуществляющий модификацию модели по действию пользователя.

**Модель** хранит и осуществляет доступ к основным данным, производит по запросам операции, определенные бизнес-логикой программы, то есть отвечает за ту часть программы, которая отвечает за все алгоритмы и процессы обработки информации.

**Контроллер** выполняет функцию связующего элемента между интерфейсом и моделью, осуществляет модификацию модели. Через него формируются запросы на изменение модели.

**Представление** показывает пользователю данные из модели в удобном и понятном виде, интерфейс программы. В идеале в представлении не должно быть никакой бизнес-логики. 

### Server-Side Rendering (SSR)

Серверный рендеринг (server-side rendering, SSR) — это технология рендеринга приложения или сайта на сервере, а не в клиентском браузере. При серверном рендеринге в ответ на запрос на сервере генерируется весь HTML-код страницы. Это исключает необходимость дополнительных запросов данных со стороны клиента, так как сервер берет всю работу на себя, прежде чем отправить ответ.
Главное  преимущество SSR — возможность повысить производительность приложения. 

Упрощенно SSR работает следующим образом:
1. Браузер запрашивает страницу;
2. Сервер генерирует HTML-страницу для вывода и отправляет ее обратно;
3. Браузер отображает HTML;
>>>>>>> b77f971712285186f32e12228b932c81685ca5f8


## Chapter III

<<<<<<< HEAD
## Part 1. Implementation of a web-application for the SQL2 project

You need to implement a web-application for the SQL2 project

### General requirements

- The program must be developed in Java 8
- The program code must be located in the src folder
- You must stick to Google Code Style when writing code
- You need to develop a desktop application
- The application must be implemented using MVC framework (Spring)
- The program must be implemented using **MVC** pattern, and
- there should be no business logic code in the view code;
- there must be no interface code in the controller and model;
- controllers must be thin;
- Perform page rendering on the server side (using **Server-Side Rendering** technology)
- You need to completely reuse the database from the SQL2 project, adding it to the Model component
- You can use [the School's brand book](https://www.figma.com/file/76J5CA8xgz5dsKuxvup20A/Platform-app?node-id=0%3A1&t=IrCONMnwrjlhlnO7-1) or the platform's visual style as a design reference
- The app design should be intuitive

### Content requirements

- The main page must contain:
  - A navigation menu that provides access to the main sections of the application: *"Data"* and *"Operations"*
  - *"About"* field, which contains basic information about the student who completed the project

- The graphical shell of the *"Data"* and *"Operations"* pages must contain the following sections:
  - A header, which, when clicked, leads to the main page
  - A navigation menu, which allows to navigate through the main sections
  - The main part of the section: informative text, illustrations, etc.
  - A navigation panel for navigating through the subsections of the selected section (if necessary)

- The *"Data"* section must contain subsections that allow the following functionality to be supported through the GUI:
  - Perform CRUD operations for all tables
  - After any table modification (create, update, delete), the application must ask the user to confirm the operation
  - After any kind of modification of tables, the modified table must be displayed to the user
  - Import and export data for each table from/to files with *.csv* extension

- The *"Operations"* section must contain components:
  - The block containing all possible queries from the SQL2 project, the name/short description of the query
  - Block allowing the user to enter the SQL-query to manipulate data in the database by himself

- The *"Operations"* section must contain subsections that allow you to support the following functionality through the GUI:
  - Selection of the desired procedure / function / query from the developed in the project SQL2 with the result output and the ability to export the result to a .csv file
  - If you need to enter parameters to execute a procedure or function, the GUI should provide a form for data entry
  - If the entered arguments / SQL-query were incorrect, the app must handle such a situation (display an error about the incorrectness of the entered data and offer to try to enter it again)
  - When executing procedures / functions / queries, the original stored operations described in the SQL language database must be called

- The configuration of the application must be done using a configuration file, which includes a DBMS connection string.

## Part 2. Logging

It is necessary to implement logging of all user actions (log files have to be written in the logs folder). Every day a new log file is created. The name of the files must correspond to the pattern *logs_dd-MM-yy-h-mm-ss*.

Each log should have its level of importance indicated:

- **Info**: expected event;
- **Warning**: unexpected events that allow the application to continue running;
- **Error**: an event that prevents the application from continuing;

## Part 3. Bonus. Deploying an application

Prepare the application to run.
To do this, you need to pack in docker containers:

- database
- proxy server (use nginx)
- web application itself

Prepare docker-compose to run the entire application. Only the docker-container containing Nginx should look "outside".
=======
## Part 1. Реализация web-приложения для проекта SQL2

Необходимо реализовать  web-приложение для проекта SQL2

### Общие требования

- Программа должна быть разработана на языке Java версии 8
- Код программы должен находиться в папке src
- При написании кода необходимо придерживаться Google Style
- Необходимо разработать Web-приложение
- Программа должна быть реализована с использованием MVC-фреймворка (Spring)
- Программа должна быть реализована с использованием паттерна **MVC**, а также: 
    - не должно быть кода бизнес-логики в коде представлений;
    - не должно быть кода интерфейса в контроллере и в модели;
    - контроллеры должны быть тонкими;
- Рендеринг страниц осуществлять на стороне сервера (использование технологии **Server-Side Rendering**)
- Вам необходимо полностью переиспользовать базу данных из проекта SQL2, включив её в компонент Model 
- В качестве референса по дизайну вы можете использовать [бренд-бук Школы](https://www.figma.com/file/76J5CA8xgz5dsKuxvup20A/Platform-app?node-id=0%3A1&t=IrCONMnwrjlhlnO7-1) или визуальный стиль платформы
- Дизайн приложения должен быть интуитивно-понятным 

### Требования к содержанию

- Главная страница должна содержать:
    - Навигационное меню, обеспечивающее переход к основным разделам приложения: *«Данные»* и *«Операции»*
    - Поле *«О себе»*, содержащее основную информацию о студенте, выполнившем проект

- Графическая оболочка страниц *«Данные»* и *«Операции»* должна содержать следующие разделы:
    - Шапка, по нажатию на которую можно осуществить переход на главную страницу
    - Навигационное меню, позволяющее осуществить переход по основным разделам
    - Основную часть раздела: содержательный информационный текст, иллюстрации и т.п
    - Навигационная панель, осуществляющая передвижение по подразделам выбранного раздела (в случае необходимости)

- Раздел *«Данные»* должен содержать подразделы, которые позволяют через GUI поддерживать следующий функционал:
    - Совершать CRUD-операции по всем таблицам
    - При любой модификации таблиц (create, update, delete) приложение должно запрашивать у пользователя подтверждение на осуществление операции
    - После любого вида модификации таблиц пользователю должна выводиться измененная таблица
    - Импорт и экспорт данных для каждой таблицы из файлов/в файлы с расширением *.csv*

- Раздел *«Операции»* должен содержать компоненты:
    - Блок, содержащий все возможные для вызова запросы из проекта SQL2, наименование/краткое описание сути запроса
    - Блок с возможностью самостоятельного ввода пользователем SQL-запроса для работы с данными в базе

- Раздел *«Операции»* должен содержать подразделы, которые позволяют через GUI поддерживать следующий функционал:
    - Выбор желаемой процедуры / функции / запроса из разработанных в проекте SQL2 с выводом результата и возможность экспорта результата в файл разрешения .csv
    - В случае необходимости введения параметров для выполнения процедуры или функции, графический интерфейс должен предоставлять форму для ввода данных
    - Если введенные аргументы/SQL-запрос были некорректны, то приложение должно обрабатывать подобную ситуацию (выдавать ошибку о некорректности введенных и данных и предлагать повторную попытку ввода)
    - При осуществлении процедур / функций / запросов необходимо вызывать оригинальные хранимые операции, описанные в базе данных на языке SQL

- Конфигурация приложения должна осуществляться при помощи файла конфигурации, который включает в себя строку подключения к СУБД. 

## Part 2. Логирование

Необходимо реализовать логирование всех действий пользователя (файлы логов записывать в папку logs). Каждый день создается новый файл логов. Название файлов должно соответствовать шаблону *logs_dd-MM-yy-hh-mm-ss*

У каждой записи должен быть обозначен ее уровень важности:
- **Info**: ожидаемое событие;
- **Warning**: неожиданные события, которые позволяют продолжить работу приложения;
- **Error**: событие, которое не позволяет дальнейшую работу программы;

## Part 3. Дополнительно. Развертывание приложения

Подготовить приложение к запуску.
Для этого необходимо упаковать в docker-контейнеры:
- базу данных
- проксирующий сервер (использовать nginx)
- само web приложение

Подготовить docker-compose для запуска всего приложения. При этом "наружу" должен смотреть только docker-контейнер, содержащий Nginx.
>>>>>>> b77f971712285186f32e12228b932c81685ca5f8

💡 [Нажми тут](https://forms.yandex.ru/cloud/6418261943f74f275bd68a2f/), **чтобы поделиться с нами обратной связью на этот проект**. Это анонимно и поможет команде Педаго сделать твоё обучение лучше.
