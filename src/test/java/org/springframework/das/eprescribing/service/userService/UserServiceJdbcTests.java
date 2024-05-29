package org.springframework.das.eprescribing.service.userService;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles({"jdbc", "hsqldb"})
class UserServiceJdbcTests extends AbstractUserServiceTests {

}
