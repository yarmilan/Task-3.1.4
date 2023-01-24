INSERT INTO roles(name) VALUES ('ROLE_USER'),
                               ('ROLE_ADMIN');

INSERT INTO users(age, last_name, password, username) VALUES (22, 'userov', '$2a$12$uPtszzYa0JPg.AFiLtqprOe/X/Zf8x0lQhzZgkCocy9oa/QmmHYai', 'user'),
                                                             (23, 'adminov', '$2a$12$uPtszzYa0JPg.AFiLtqprOe/X/Zf8x0lQhzZgkCocy9oa/QmmHYai', 'admin');

INSERT INTO users_roles VALUES (1, 1),
                               (2, 1),
                               (2, 2);