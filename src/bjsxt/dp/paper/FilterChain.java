package bjsxt.dp.paper;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hwp
 * @PACKAGE_NAME: bjsxt.dp.paper
 * @company:小清新
 * @USER:小清新
 * @date: 2021年03月19日 13:49
 * @PROJECT_NAME: test
 **/

public class FilterChain implements Filter{
    List<Filter> filterList=new ArrayList<Filter>();
    public List<Filter> addFilter(Filter filter){
        this.filterList.add(filter);
        return filterList;
    }
    @Override
    public void doFilter(String questionType) {
        for (Filter ft:filterList) {
            ft.doFilter(questionType);
        }
    }
}
