package bjsxt.dp.paper;

/**
 * @author hwp
 * @PACKAGE_NAME: bjsxt.dp.paper
 * @company:小清新
 * @USER:小清新
 * @date: 2021年03月19日 13:59
 * @PROJECT_NAME: test
 **/

public class SingleChoiceFilter implements Filter{
    @Override
    public void doFilter(String questionType) {
        if(questionType.equals("单选")){
            System.out.println("添加单选题");
        }
    }
}
