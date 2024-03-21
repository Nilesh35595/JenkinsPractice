package githubrun.githubrun;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public class BaseTestPage {

	
	protected static final Logger LOGGER = LogManager.getLogger(BaseTestPage.class.getName());

	

	
}
