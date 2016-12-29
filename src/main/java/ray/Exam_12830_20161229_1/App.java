package ray.Exam_12830_20161229_1;

import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ray.Exam_12830_20161229_1.dto.Film;
import ray.Exam_12830_20161229_1.service.impl.FilmServiceImpl;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext cac = new ClassPathXmlApplicationContext("mybatis/ApplicationContext.xml");
        // 执行cac的start事件
        cac.start();
        FilmServiceImpl service = (FilmServiceImpl) cac.getBean("filmService");
        Scanner sc = new Scanner(System.in);
        Film film = new Film();
        System.out.println("请输入电影名称(title):");
        // 把第一次输入的一行字符串set成title
        film.setTitle(sc.nextLine());
        System.out.println("请输入电影描述(description):");
        // 第二次输入的一行字符串set成description
        film.setDescription(sc.nextLine());
        while (true) {
            System.out.println("请输入语言 ID(language_id):");
            // 第三次输入的一行字符串set成lnguageId
            film.setLanguageId(sc.nextInt());
            // 把打包好的dto传入到service里面去
            if (service.insertFilm(film)) {
                break;
            }
            System.out.println("ID不存在，请重新输入");
        }
        cac.stop();
        // 执行cac的stop事件
        try {
            if (sc != null) {
                sc.close();
            }
            if (cac != null) {
                cac.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
