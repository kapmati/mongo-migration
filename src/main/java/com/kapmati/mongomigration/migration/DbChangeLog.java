package com.kapmati.mongomigration.migration;

import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;
import com.mongodb.client.MongoDatabase;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@ChangeLog(order = "1")
public class DbChangeLog {
    @ChangeSet(order = "001", id = "DESCRIPTION", author = "AUTHOR")
    public void oldMigrationDesc(MongoDatabase db) {
        log.info("Old migration");
        // do migration
    }
}
