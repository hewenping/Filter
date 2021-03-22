package bjsxt.dp.paper;

import lombok.Data;

/**
 * @author hwp
 * @PACKAGE_NAME: bjsxt.dp.paper
 * @company:小清新
 * @USER:小清新
 * @date: 2021年03月19日 13:37
 * @PROJECT_NAME: test
 **/
@Data
public class PaperFilter {
    private String  questionType;
    FilterChain filterChain;
    public void fillPaper(){
        filterChain.doFilter(questionType);
    }
}
