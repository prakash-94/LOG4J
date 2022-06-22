package Beta;

import org.apache.logging.log4j.*;

public class Demo1 {
	
	private static Logger log = LogManager.getLogger(Demo1.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.debug("I am Debugging");
		log.info("Object is Present");
		log.error("Object is not Present");
		log.fatal("This is Fatal  ");
	}

}
