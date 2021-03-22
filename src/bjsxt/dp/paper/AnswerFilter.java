package bjsxt.dp.paper;

/**
 * @author hwp
 * @PACKAGE_NAME: bjsxt.dp.paper
 * @company:小清新
 * @USER:小清新
 * @date: 2021年03月19日 14:32
 * @PROJECT_NAME: test
 **/

public class AnswerFilter implements Filter{
    @Override
    public void doFilter(String questionType) {
        if(questionType.equals("多选")){
            System.out.println("添加简单题");
        }
    }
}
