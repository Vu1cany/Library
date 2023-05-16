# Веб приложение библиотеки
> *Данный проект был выполнен в качестве pet-project*
### ОГЛАВЛЕНИЕ
* [Поставленная задача](#поставленная-задача)
* [Описание функционал](#описание-функционала)
* [Страницы приложения](#страницы-приложения)
* [Используемые технологии](#используемые-технологии)
* [Как установить и запустить]()

### Поставленная задача
В местной библиотеке хотят перейти на цифровой учет книг. Необходимо реализовать веб-приложение. Библиотекари должны иметь возможность регистрировать читателей, выдавать им книги и освобождать книги (после того, как читатель возвращает книгу обратно в библиотеку).

### Описание функционала
1. Страницы добавления, изменения и удаления человека. 
3. Страницы добавления, изменения и удаления книги
4. Страница со списком всех людей (люди кликабельные - при клике осуществляется
переход на страницу человека).
4. Страница со списком всех книг (книги кликабельные - при клике осуществляется
переход на страницу книги).
5. Страница человека, на которой показаны значения его полей и список книг, которые он
взял. Если человек не взял ни одной книги, вместо текст "Человек
пока не взял ни одной книги".
6. Страница книги, на которой показаны значения полей этой книги и имя человека,
который взял эту книгу. Если эта книга не была никем взята - текст "Эта
книга свободна".
7. На странице книги, если книга взята человеком, рядом с его именем кнопка
"Освободить книгу". Эта кнопка нажимается библиотекарем тогда, когда читатель возвращает эту книгу обратно в библиотеку. После нажатия на эту кнопку книга снова становится свободной и пропадает из списка книг человека.
8. На странице книги, если книга свободна, выпадающий список со всеми людьми и кнопка "Назначить книгу". Эта кнопка нажимается библиотекарем
тогда, когда читатель хочет забрать эту книгу домой. После нажатия на эту кнопку, книга начинает принадлежать выбранному человеку и появляется в его списке книг.

### Страницы приложения
__Главная страница__    
<img width="496" alt="image" src="https://github.com/Vu1cany/Library/assets/113231218/3eab6776-8272-4cff-81b9-324e06575491">   
<img width="496" alt="image" src="https://github.com/Vu1cany/Library/assets/113231218/2242ae2e-7f2d-4741-a17b-3014307575f0">   

__Список книг__   
<img width="496" alt="image" src="https://github.com/Vu1cany/Library/assets/113231218/1ca278fa-db2d-4208-9623-d6755e79e9d1">
<img width="651" alt="image" src="https://github.com/Vu1cany/Library/assets/113231218/3325e992-af2a-46d7-a60d-0542674d053e">

__Добавление книги__   
<img width="496" alt="image" src="https://github.com/Vu1cany/Library/assets/113231218/cf01739b-8bb1-4e3a-857b-b5a7c94184fa">
<img width="651" alt="image" src="https://github.com/Vu1cany/Library/assets/113231218/436fe3fc-3e78-4ee0-b1b8-4005a64e377f">

__Страница книги__     
<img width="494" alt="image" src="https://github.com/Vu1cany/Library/assets/113231218/cf1865c4-c028-44a5-8309-d668b25237cb">   
<img width="651" alt="image" src="https://github.com/Vu1cany/Library/assets/113231218/9bd1de79-2aef-4ce2-9af4-147598faf8fb">     
<img width="651" alt="image" src="https://github.com/Vu1cany/Library/assets/113231218/803a8b05-2321-4e49-8493-a7c8fa116c46">   

__Редактирование книги__   
<img width="494" alt="image" src="https://github.com/Vu1cany/Library/assets/113231218/8c07652b-0c0d-488f-8d8d-505444c94fed">   
<img width="651" alt="image" src="https://github.com/Vu1cany/Library/assets/113231218/f903e33e-68c6-4360-9f5d-3b2fc95646b8">  

__Список читателей__   
<img width="494" alt="image" src="https://github.com/Vu1cany/Library/assets/113231218/96a852d4-066b-40ea-8512-381b4a0ca41e">   
<img width="651" alt="image" src="https://github.com/Vu1cany/Library/assets/113231218/1ffc6a83-37fc-40f2-adb4-759da59e1f8c">   

__Добавление читателя__   
<img width="494" alt="image" src="https://github.com/Vu1cany/Library/assets/113231218/919a8d67-c0e9-477c-8b62-16984434ce34">   
<img width="651" alt="image" src="https://github.com/Vu1cany/Library/assets/113231218/7e2d3759-de15-4f60-b58b-81bb678d0672">

__Страница читателя__  
<img width="494" alt="image" src="https://github.com/Vu1cany/Library/assets/113231218/33499c79-bc5c-4588-8274-d6d66f4003e4">   
<img width="651" alt="image" src="https://github.com/Vu1cany/Library/assets/113231218/00ba8668-c432-4227-a420-2b265019d1b7">   
<img width="651" alt="image" src="https://github.com/Vu1cany/Library/assets/113231218/73fbc263-40be-4f59-a8aa-d4a3a9f5331b">   

__Редактирование читателя__   
<img width="494" alt="image" src="https://github.com/Vu1cany/Library/assets/113231218/cdafdd8a-8850-43bd-9523-da7532e1aed3">   
<img width="651" alt="image" src="https://github.com/Vu1cany/Library/assets/113231218/164743fd-9886-481e-b7ae-2566a51ad2e8">   

### Используемые технологии
* Java
* Spring Core
* Spring MVC
* JDBC Template
* Maven
* Thymeleaf







