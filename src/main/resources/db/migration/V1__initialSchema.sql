CREATE TABLE PING_PONG_TABLE (Id INT IDENTITY, Name VARCHAR(100));
INSERT INTO PING_PONG_TABLE (Name)
SELECT 'Good Table' UNION
SELECT 'Bad Table';

CREATE TABLE PLAYER (Id INT IDENTITY, Name VARCHAR(100));

INSERT INTO PLAYER (Name)
SELECT 'Piper' UNION
SELECT 'Tom';

CREATE TABLE RESERVATION (
  id INT IDENTITY,
  player_id INT,
  ping_pong_table_id INT,
  completed BIT,
  FOREIGN KEY(player_id) REFERENCES PLAYER(id),
  FOREIGN KEY(ping_pong_table_id) REFERENCES PING_PONG_TABLE(id)
);
INSERT INTO RESERVATION (player_id, ping_pong_table_id, completed)
SELECT 1, 1, 1