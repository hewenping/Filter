package bjsxt.dp.paper;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hwp
 * @PACKAGE_NAME: bjsxt.dp.paper
 * @company:小清新
 * @USER:小清新
 * @date: 2021年03月19日 13:32
 * @PROJECT_NAME: test
 **/
public class TestPaper {
    /**
     * 生成试卷将不同试题插入数据库
     * */
    public static void main(String[] args) {
        String [] problemList={"单选","多选","简答"};
        for (String questionType:problemList) {
           PaperFilter pf=new  PaperFilter();
           FilterChain fc=new FilterChain();
           fc.addFilter(new CheckBoxFilter());
           fc.addFilter(new AnswerFilter());
           fc.addFilter(new SingleChoiceFilter());
           pf.setQuestionType(questionType);
           pf.setFilterChain(fc);
           pf.fillPaper();
        }
    }
}
