CREATE TABLE IF NOT EXISTS USUARIO (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre_usuario VARCHAR(255) NOT NULL,
    nombre_completo VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
);
delete from usuario;
INSERT INTO USUARIO (nombre_usuario, nombre_completo, password) VALUES ('user1', 'User One', '$2a$12$TnwZHcRESmU7VBrCoZKSx.Hw4Lw.FqxhzmppaScd4kUJfpTlmtXfK');