/*
 * package comdeptempjwtappln;
 * 
 * import static org.junit.Assert.assertEquals; import static
 * org.junit.Assert.assertNotNull;
 * 
 * import java.sql.Connection; import java.sql.DriverManager; import
 * java.sql.SQLException;
 * 
 * import org.junit.jupiter.api.Test; import org.junit.runner.RunWith; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.boot.test.context.SpringBootTest; import
 * org.springframework.test.context.junit4.SpringRunner;
 * 
 * import com.deptempspbsecurityi18.dao.DeptEmpDao; import
 * com.deptempspbsecurityi18.dao.DeptEmpDaoImpl; import
 * com.deptempspbsecurityi18.model.Department; import
 * com.deptempspbsecurityi18.model.Employee;
 * 
 * @SpringBootTest(classes =Deptempsecurityi18nh2ApplicationTests.class ) class
 * Deptempsecurityi18nh2ApplicationTests {
 * 
 * @Test void contextLoads() { assertNotNull("hello", "hai"); }
 * 
 * @Autowired DeptEmpDao empd;
 * 
 * Department dep = new Department(1, "training", "pune"); Department dep1 = new
 * Department(2, "development", "palakkad"); Department dep2 = new Department(3,
 * "support", "chhennai"); Employee emp = new Employee(23, "manoj",
 * "mano@gmail.com", "1993-02-26", 894315697, 46953.56f, "tcs", dep); Employee
 * emp1 = new Employee(25, "rakesh", "rake@gmail.com", "1991-03-26", 894315697,
 * 32953.56f, "cts", dep2); Employee emp2 = new Employee(26, "kiraan",
 * "ksh@gmail.com", "1996-02-26", 894315697, 26953.56f, "ibm", dep1); Employee
 * emp4 = new Employee(29, "Kumar", "kum@gmail.com", "1990-08-26", 894315697,
 * 36953.56f, "infomatica", dep);
 * 
 * Connection con;
 * 
 * @Test
 * 
 * public void a_connectionCheck() {
 * 
 * try { Class.forName("com.mysql.cj.jdbc.Driver"); } catch
 * (ClassNotFoundException e) {
 * 
 * System.err.println("Driver Error"); } try { con =
 * DriverManager.getConnection("jdbc:mysql://localhost:3306/deptempspb", "root",
 * "root"); System.out.println("Connection successfull");
 * assertNotNull("successfull", con);
 * 
 * } catch (SQLException e) {
 * 
 * System.err.println("Connection invalid"); } }
 * 
 * @Test public void b_createDept() { // a_connectionCheck();
 * 
 * 
 * assertNotNull("Department Created", empd.createDept(dep));
 * assertNotNull("Department Created", empd.createDept(dep2));
 * assertNotNull("Department Created", empd.createDept(dep1));
 * 
 * try {
 * 
 * assertEquals(true,empd.createDept(dep));
 * 
 * System.out.println("val" + dep.getDeptName());
 * System.out.println("Connection closed"); } catch (Exception e) {
 * 
 * System.err.println("Connection issue"); e.printStackTrace(); }
 * 
 * } // create employee
 * 
 * @Test public void c_createEmployee() { a_connectionCheck();
 * assertNotNull("Creating employee", empd.createEmp(emp));
 * assertNotNull("Creating employee", empd.createEmp(emp1));
 * assertNotNull("Creating employee", empd.createEmp(emp2));
 * assertNotNull("Creating employee", empd.createEmp(emp));
 * assertNotNull("Creating employee", empd.createEmp(emp1));
 * assertNotNull("Creating employee", empd.createEmp(emp2));
 * 
 * try { //con.close(); System.out.println("Connection closed"); } catch
 * (Exception e) {
 * 
 * System.err.println("Connection issue"); } } // Get All Department Values
 * 
 * 
 * 
 * 
 * @Test public void d_readDept() { a_connectionCheck();
 * assertNotNull("Showing Department values", empd.readAllDept()); try {
 * 
 * //con.close();
 * 
 * System.out.println("Connection closed"); } catch (Exception e) {
 * 
 * System.err.println("Connection issue");
 * 
 * } } // update employee in department
 * 
 * @Test public void e_updateEmp() { a_connectionCheck();
 * 
 * assertNotNull("Employee Updated", empd.updateEmp(emp4)); try { //con.close();
 * System.out.println("Connection closed"); } catch (Exception e) {
 * 
 * System.err.println("Connection issue"); } } // update department
 * 
 * @Test public void f_updateDept() { a_connectionCheck();
 * 
 * assertNotNull("Department Updated", empd.updateDept(dep1)); try {
 * //con.close(); System.out.println("Connection closed"); } catch (Exception e)
 * {
 * 
 * System.err.println("Connection issue"); }
 * 
 * }
 * 
 * // get employees from department
 * 
 * @Test
 * 
 * public void g_readEmp() {
 * 
 * a_connectionCheck();
 * 
 * assertNotNull("Showing Employee", empd.readEmpFromDept(dep2.getDeptId()));
 * 
 * try { //con.close(); System.out.println("Connection closed"); } catch
 * (Exception e) {
 * 
 * System.err.println("Connection issue"); }
 * 
 * } // delete employee in department
 * 
 * @Test
 * 
 * public void h_deleteEmp() {
 * 
 * a_connectionCheck();
 * 
 * assertNotNull("deleted Employee", empd.deleteEmpFromDept(dep.getDeptId(),
 * emp.getEmpId())); try { //con.close();
 * System.out.println("Connection closed"); } catch (Exception e) {
 * 
 * System.err.println("Connection issue"); } } // delete department
 * 
 * @Test public void i_deleteDept() { a_connectionCheck();
 * assertNotNull("deleting Department", empd.delteDept(dep2.getDeptId())); try {
 * //con.close(); System.out.println("Connection closed"); } catch (Exception e)
 * {
 * 
 * System.err.println("Connection issue"); }
 * 
 * }
 * 
 * @Test public void j_readEmp() { a_connectionCheck();
 * assertNotNull("reading employee value Department", empd.readEmpFromDept(1));
 * try { //con.close(); System.out.println("Connection closed"); } catch
 * (Exception e) {
 * 
 * System.err.println("Connection issue"); }
 * 
 * }
 * 
 * }
 */