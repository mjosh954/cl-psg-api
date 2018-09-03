
CREATE TABLE IF NOT EXISTS ClojureCommand
(
    command_id SERIAL NOT NULL PRIMARY KEY,
    name CHARACTER varying(200) NOT NULL,
    command CHARACTER varying(200) NOT NULL,
    description TEXT NOT NULL,
    example TEXT
);

CREATE UNIQUE INDEX command_idx
    ON ClojureCommand USING btree
    (command ASC NULLS LAST)
    TABLESPACE pg_default;