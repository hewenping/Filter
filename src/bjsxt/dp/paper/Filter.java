package bjsxt.dp.paper;

/**
 * @author hwp
 */
public interface Filter {
    /***
      *传入问题类型 进入责任链
      *@param questionType
      *@return: void 
      *@author: 小清新
      *@Date: 2021/3/19 
     **/
    void doFilter(String  questionType);
}
