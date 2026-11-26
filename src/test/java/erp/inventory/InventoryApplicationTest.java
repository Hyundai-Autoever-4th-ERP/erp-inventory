package erp.inventory;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class InventoryApplicationTest {
    @Test
    void connectsToPostgres(@Autowired JdbcTemplate jdbc) {
        assertThat(jdbc.queryForObject("select current_database()", String.class)).isEqualTo("inventory_db");
    }
}
