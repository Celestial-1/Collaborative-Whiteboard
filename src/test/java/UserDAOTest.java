import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;  // Correct import for JUnit 5
import static org.junit.jupiter.api.Assertions.assertTrue;   // Correct import for JUnit 5

import dao.DAO;

class UserDAOTest {
    
    DAO userDAO = new DAO();
    
    @Test
    void selectUser_testcase1() {
        assertNotNull(userDAO.getUserById(1));  // Test to check if the user fetched by ID is not null
    }

    @Test  // Add @Test annotation for this method
    void selectBoard_testcase1() {
        assertNotNull(userDAO.getDrawingsByBoardId(1));  // Test to check if the board drawing fetched by board ID is not null
    }

    @Test
    void createBoard_testcase1() {
        assertTrue(userDAO.createBoard("null", 0));  // Test to check if the createBoard method returns true
    }
}
