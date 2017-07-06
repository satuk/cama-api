DELETE FROM applications;
DELETE FROM works;
DELETE FROM events;
DELETE FROM users_companies;
DELETE FROM companies;
DELETE FROM users;

INSERT INTO users (id, first_name, last_name, password, email, address, age, postal_code, handy_number, city, date_created) VALUES (1, 'Satuk', 'Kolan', 'password', 'satuk@kolan.ch', 'Im Brünneli 8', 33, 8127, 0793085018, 'Maur', {ts '2017-01-01 00:00:00.00'});

INSERT INTO companies (id, name, address, postal_code, description, url, date_created) VALUES (1, 'Catering AG', '2526 cta 95th st, fort lauderdale, florida, united states, 33930', 5611, 'Lorem ipsum aenean suscipit ante tincidunt taciti, dictum mi fames inceptos vel natoque aenean?\nNulla in nullam lacus, auctor vel phasellus pulvinar senectus.\n', 'http://www.digg.com/books/howto/fr/fr/2013/09/404.html', {ts '2017-01-01'});
INSERT INTO companies (id, name, address, postal_code, description, url, date_created) VALUES (2, 'Aura Group', '2526 cta 95th st, fort lauderdale, florida, united states, 33930', 5611, 'Lorem ipsum aenean suscipit ante tincidunt taciti, dictum mi fames inceptos vel natoque aenean?\nNulla in nullam lacus, auctor vel phasellus pulvinar senectus.\n', 'http://www.digg.com/books/howto/fr/fr/2013/09/404.html', {ts '2017-01-01'});

INSERT INTO events (id, event_name, logo, event_date, event_start, event_end, different_location, expected_person, company_id, date_created, visibility) VALUES (1, 'Turkish Night', 'http://placehold.it/300x250', {ts '2017-10-10'}, {ts '2017-01-01 00:00:00.00'}, {ts '2017-01-01 00:00:00.00'}, 0, 400, 1, {ts '2017-01-01'}, true );

INSERT INTO users_companies(user_id, companies_id) VALUES (1, 1);

INSERT INTO applications(id, date_created, event_id, user_id) VALUES (1, {ts '2017-01-01 00:00:00.00'}, 1, 1);

-- INSERT INTO works(id, date_created, event_id, user_id) VALUES (1, {ts '2017-01-01 00:00:00.00'}, 1, 1);
