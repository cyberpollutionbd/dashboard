package nl.topicus.onderwijs.dashboard.datasources;

import nl.topicus.onderwijs.dashboard.modules.DataSource;
import nl.topicus.onderwijs.dashboard.modules.DataSourceSettings;

@DataSourceSettings(label = "Tests", htmlClass = "number", type = Integer.class)
public interface NumberOfUnitTests extends DataSource<Integer> {
}
