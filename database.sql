create database library;

CREATE TABLE category(
code varchar(10),
title varchar(50),
description varchar(255)
);
INSERT INTO category (code, title, description) VALUES
('CAT001', 'Fiction', 'Narrative literary works, including novels and short stories.'),
('CAT002', 'Non-fiction', 'Informative books based on factual information.'),
('CAT003', 'Science', 'Books related to various scientific disciplines and discoveries.'),
('CAT004', 'History', 'Historical accounts and studies of past events.'),
('CAT005', 'Biography', 'Life stories and accounts of notable individuals.'),
('CAT006', 'Children', 'Books for young readers, including picture books and early readers.'),
('CAT007', 'Mystery', 'Books centered around suspenseful and thrilling plotlines.'),
('CAT008', 'Fantasy', 'Books featuring magical or supernatural elements and worlds.'),
('CAT009', 'Self-Help', 'Guides and advice for personal development and improvement.'),
('CAT010', 'Technology', 'Books on technological advancements and computer science.');

CREATE TABLE books(
BookId varchar(10),
Title varchar(150),
Author varchar(150),
Date varchar(50),
Category varchar(255)
);
INSERT INTO books (BookId, Title, Author, Date, Category) VALUES
('B001', 'To Kill a Mockingbird', 'Harper Lee', '1960', 'Fiction'),
('B002', 'A Brief History of Time', 'Stephen Hawking', '1988', 'Science'),
('B003', 'The Diary of a Young Girl', 'Anne Frank', '1947', 'Biography'),
('B004', 'The Very Hungry Caterpillar', 'Eric Carle', '1969', 'Children'),
('B005', 'The Great Gatsby', 'F. Scott Fitzgerald', '1925', 'Fiction'),
('B006', 'Sapiens: A Brief History of Humankind', 'Yuval Noah Harari', '2011', 'Non-fiction'),
('B007', 'The Catcher in the Rye', 'J.D. Salinger', '1951', 'Fiction'),
('B008', 'The Selfish Gene', 'Richard Dawkins', '1976', 'Science'),
('B009', 'The Hobbit', 'J.R.R. Tolkien', '1937', 'Fantasy'),
('B010', 'Steve Jobs', 'Walter Isaacson', '2011', 'Biography'),
('B011', 'The 7 Habits of Highly Effective People', 'Stephen R. Covey', '1989', 'Self-Help'),
('B012', 'Guns, Germs, and Steel', 'Jared Diamond', '1997', 'History'),
('B013', 'The Lean Startup', 'Eric Ries', '2011', 'Technology'),
('B014', 'Harry Potter and the Philosopher\'s Stone', 'J.K. Rowling', '1997', 'Fantasy'),
('B015', 'The Girl with the Dragon Tattoo', 'Stieg Larsson', '2005', 'Mystery');

select * from books;
ALTER TABLE books
RENAME COLUMN BookId to bookId;
SELECT Category FROM books

DELETE FROM books WHERE bookId='B016';
UPDATE books SET Author = 'wik', Category = 'Fantasy', Date = 1925, Title = 'lol' WHERE bookId ='B010';

CREATE TABLE members(
NIC varchar(20),
Name varchar(150),
Address varchar(150),
password varchar(50)
);
INSERT INTO members (NIC, Name, Address, password) VALUES
('123456789V', 'John Doe', '123 Main St', 'password123'),
('987654321V', 'Jane Smith', '456 Oak St', 'securepassword'),
('456123789V', 'Alice Johnson', '789 Pine St', 'mypassword'),
('321654987V', 'Bob Brown', '101 Maple St', 'password456');
select*from books;

CREATE TABLE issue(
NIC varchar(20),
bookid varchar(150),
issueDate varchar(50),
dueDate varchar(50),
returnBook varchar(5)
);
INSERT INTO issue (NIC, bookid, issueDate, dueDate,returnBook) VALUES
('123456789V', 'B005', '11-07-2024', '15-07-2024',"NO");
UPDATE issue SET returnBook='No' WHERE NIC='60160592V';

CREATE TABLE login(
username varchar(50),
password varchar(50)
);

INSERT INTO login(username,password) VALUES ('admin','admin');

