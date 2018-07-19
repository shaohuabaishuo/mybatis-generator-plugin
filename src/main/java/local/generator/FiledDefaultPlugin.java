package local.generator;

import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.config.Context;

import java.util.List;
import java.util.Properties;


/**
 * 按照方法的书写顺序依次执行
 */
public class FiledDefaultPlugin extends PluginAdapter {

    @Override
    public void setContext(Context context) {
        super.setContext(context);
    }

    @Override
    public void setProperties(Properties properties) {
        super.setProperties(properties);
    }

    public boolean validate(List<String> warnings) {
        return false;
    }
}
