INSERT INTO companies (id, name, address, postal_code, description, url, date_created) VALUES (1, 'Aura Group', '2526 cta 95th st, fort lauderdale, florida, united states, 33930', 5611, 'Lorem ipsum aenean suscipit ante tincidunt taciti, dictum mi fames inceptos vel natoque aenean?\nNulla in nullam lacus, auctor vel phasellus pulvinar senectus.\n', 'http://www.digg.com/books/howto/fr/fr/2013/09/404.html', {ts '2017-01-01'});
INSERT INTO companies (id, name, address, postal_code, description, url, date_created) VALUES (2, 'Metropol Restaurant', '2526 cta 95th st, fort lauderdale, florida, united states, 33930', 5611, 'Lorem ipsum aenean suscipit ante tincidunt taciti, dictum mi fames inceptos vel natoque aenean?\nNulla in nullam lacus, auctor vel phasellus pulvinar senectus.\n', 'http://www.digg.com/books/howto/fr/fr/2013/09/404.html', {ts '2017-01-01'});
INSERT INTO companies (id, name, address, postal_code, description, url, date_created) VALUES (3, 'Catering AG', '2526 cta 95th st, fort lauderdale, florida, united states, 33930', 5611, 'Lorem ipsum aenean suscipit ante tincidunt taciti, dictum mi fames inceptos vel natoque aenean?\nNulla in nullam lacus, auctor vel phasellus pulvinar senectus.\n', 'http://www.digg.com/books/howto/fr/fr/2013/09/404.html', {ts '2017-01-01'});


INSERT INTO users (id, first_name, last_name, password, email, address, age, postal_code, handy_number, city, date_created) VALUES (1, 'Satuk', 'Kolan', 'password', 'satuk@kolan.ch', 'Im Brünneli 8', 33, 8127, 0793085018, 'Maur', {ts '2017-01-01 00:00:00.00'});
INSERT INTO users (id, first_name, last_name, password, email, address, age, postal_code, handy_number, city, date_created) VALUES (2, 'Ceylan', 'Kolan', 'password', 'ceylan@kolan.ch', 'Im Brünneli 8', 29, 8127, 0790000000, 'Maur', {ts '2017-01-01 00:00:00.00'});
INSERT INTO users (id, first_name, last_name, password, email, address, age, postal_code, handy_number, city, date_created) VALUES (3, 'Hans', 'Muster', 'password', 'hans@muster.ch', 'Bahnhofstrasse 100', 55, 8000, 0790000000, 'Zürich', {ts '2017-01-01 00:00:00.00'});
INSERT INTO users (id, first_name, last_name, password, email, address, age, postal_code, handy_number, city, date_created) VALUES (4, 'Hans1', 'Muster1', 'password', 'hans1@muster.ch', 'Bahnhofstrasse 100', 55, 8000, 0790000000, 'Zürich', {ts '2017-01-01 00:00:00.00'});
INSERT INTO users (id, first_name, last_name, password, email, address, age, postal_code, handy_number, city, date_created) VALUES (5, 'Hans2', 'Muster2', 'password', 'hans2@muster.ch', 'Bahnhofstrasse 100', 55, 8000, 0790000000, 'Zürich', {ts '2017-01-01 00:00:00.00'});
INSERT INTO users (id, first_name, last_name, password, email, address, age, postal_code, handy_number, city, date_created) VALUES (6, 'Hans3', 'Muster3', 'password', 'hans3@muster.ch', 'Bahnhofstrasse 100', 55, 8000, 0790000000, 'Zürich', {ts '2017-01-01 00:00:00.00'});


INSERT INTO events (id, event_name, logo, event_date, event_start, event_end, different_location, expected_person, company_id, date_created, visibility) VALUES (1, 'Turkish Night', 'http://placehold.it/300x250', {ts '2017-01-01'}, {ts '2017-01-01 00:00:00.00'}, {ts '2017-01-01 00:00:00.00'}, 0, 400, 1, {ts '2017-01-01'}, true );
INSERT INTO events (id, event_name, logo, event_date, event_start, event_end, different_location, expected_person, company_id, date_created, visibility) VALUES (2, 'Istanbul Night', 'http://placehold.it/300x250', {ts '2017-01-01'}, {ts '2017-01-01 00:00:00.00'}, {ts '2017-01-01 00:00:00.00'}, 0, 400, 1, {ts '2017-01-01'}, true );
INSERT INTO events (id, event_name, logo, event_date, event_start, event_end, different_location, expected_person, company_id, date_created, visibility) VALUES (3, 'Italian Night', 'http://placehold.it/300x250', {ts '2017-01-01'}, {ts '2017-01-01 00:00:00.00'}, {ts '2017-01-01 00:00:00.00'}, 0, 200, 2, {ts '2017-01-01'}, true );
INSERT INTO events (id, event_name, logo, event_date, event_start, event_end, different_location, expected_person, company_id, date_created, visibility) VALUES (4, 'Birthday Party', 'http://placehold.it/300x250', {ts '2017-01-01'}, {ts '2017-01-01 00:00:00.00'}, {ts '2017-01-01 00:00:00.00'}, 0, 33, 3, {ts '2017-01-01'}, true );


INSERT INTO users_companies(user_id, companies_id) VALUES (1, 1);
INSERT INTO users_companies(user_id, companies_id) VALUES (1, 2);
INSERT INTO users_companies(user_id, companies_id) VALUES (1, 3);

INSERT INTO users_companies(user_id, companies_id) VALUES (2, 1);
INSERT INTO users_companies(user_id, companies_id) VALUES (2, 2);

INSERT INTO users_companies(user_id, companies_id) VALUES (3, 3);
INSERT INTO users_companies(user_id, companies_id) VALUES (3, 2);


INSERT INTO works(id, date_created, event_id, user_id) VALUES (1, {ts '2017-01-01 00:00:00.00'}, 1, 1);
INSERT INTO works(id, date_created, event_id, user_id) VALUES (2, {ts '2017-01-01 00:00:00.00'}, 3, 1);
INSERT INTO works(id, date_created, event_id, user_id) VALUES (3, {ts '2017-01-01 00:00:00.00'}, 2, 1);
INSERT INTO works(id, date_created, event_id, user_id) VALUES (4, {ts '2017-01-01 00:00:00.00'}, 2, 2);
INSERT INTO works(id, date_created, event_id, user_id) VALUES (5, {ts '2017-01-01 00:00:00.00'}, 2, 3);
INSERT INTO works(id, date_created, event_id, user_id) VALUES (6, {ts '2017-01-01 00:00:00.00'}, 3, 3);


INSERT INTO applications(id, date_created, event_id, user_id) VALUES (1, {ts '2017-01-01 00:00:00.00'}, 1, 1);
INSERT INTO applications(id, date_created, event_id, user_id) VALUES (2, {ts '2017-01-01 00:00:00.00'}, 2, 1);
INSERT INTO applications(id, date_created, event_id, user_id) VALUES (3, {ts '2017-01-01 00:00:00.00'}, 3, 1);
INSERT INTO applications(id, date_created, event_id, user_id) VALUES (4, {ts '2017-01-01 00:00:00.00'}, 4, 1);

INSERT INTO applications(id, date_created, event_id, user_id) VALUES (5, {ts '2017-01-01 00:00:00.00'}, 1, 2);
INSERT INTO applications(id, date_created, event_id, user_id) VALUES (6, {ts '2017-01-01 00:00:00.00'}, 1, 3);
INSERT INTO applications(id, date_created, event_id, user_id) VALUES (7, {ts '2017-01-01 00:00:00.00'}, 1, 4);
INSERT INTO applications(id, date_created, event_id, user_id) VALUES (8, {ts '2017-01-01 00:00:00.00'}, 1, 5);
INSERT INTO applications(id, date_created, event_id, user_id) VALUES (9, {ts '2017-01-01 00:00:00.00'}, 1, 6);
