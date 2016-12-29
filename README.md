把项目pull到本地
maven 命令为：
	mvn clean
	mvn exec:java -Dexec.mainClass="ray.Exam_12830_20161229_1.App"

程序入口为App类
进入程序之后，先输入title，这里注意，如果IDE是eclipse，每次输入汉字前，请先按一个方向键下 ↓
第二次输入description（请注意汉字问题）
第三次输入为language_id，这里有验证，如果输入的ID在language表里面没有对应的ID的话，会重新执行这一步，要求继续输入ID，直到输入正确