//package FirstSpringBootApp;
//
//import java.io.*;
//
////import org.omg.CORBA.DataInputStream;
//import org.python.core.Py;
//import org.python.core.PySystemState;
//import org.python.util.PythonInterpreter;
//
//public class InvokeByRuntime {
//    /**
//     * @param args
//     * @throws IOException
//     * @throws InterruptedException
//     */
////    public static void main(String[] args) throws IOException, InterruptedException {
////        String exe = "D:\\Anaconda3\\envs\\testEnviron\\python.exe";
////        String command = "C:\\Users\\X1\\Desktop\\fromGitHub\\eulerian-remote-heartrate-detection\\test.py";
//////        String num1 = "1";
//////        String num2 = "2";
////        String[] cmdArr = new String[] {exe, command/*, num1, num2*/};
////        Process process = Runtime.getRuntime().exec(cmdArr);
////        InputStream is = process.getInputStream();
////        DataInputStream dis = new DataInputStream(is);
////        String str = dis.readLine();
////        process.waitFor();
////        System.out.println("here");
////        System.out.println(str);
////    }
//
////    public static void main(String[] args) {
////        String[] arguments = new String[]{"D:\\Anaconda3\\envs\\testEnviron\\python.exe",
////                "C:\\Users\\X1\\Desktop\\fromGitHub\\eulerian-remote-heartrate-detection\\test.py"};
////        try {
////            Process process = Runtime.getRuntime().exec(arguments);
////            BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()));
////            String line = null;
////            System.out.println("t1");
////            while ((line = in.readLine()) != null) {
////                System.out.println(line);
////                System.out.println("t2");
////            }
////            System.out.println("t3");
////            in.close();
////            int re = process.waitFor();
////            System.out.println(re);
////        } catch (Exception e) {
////            System.out.println("t4");
////            e.printStackTrace();
////        }
////    }
//
////    public static void main(String args[]) throws IOException, InterruptedException {
////        PySystemState sys = Py.getSystemState();
////        PythonInterpreter interpreter = new PythonInterpreter();
//////        sys.path.add("D:\\jython2.7.0\\Lib");
//////        sys.path.add("D:\\PyCharm 2019.2\\helpers\\pydev");
//////        sys.path.add("D:\\PyCharm 2019.2\\helpers\\pycharm_display");
//////        sys.path.add("D:\\PyCharm 2019.2\\helpers\\third_party\\thriftpy");
//////        sys.path.add("D:\\PyCharm 2019.2\\helpers\\pydev");
//////        sys.path.add("D:\\Anaconda3\\envs\\testEnviron\\python37.zip");
//////        sys.path.add("D:\\Anaconda3\\envs\\testEnviron\\DLLs");
//////        sys.path.add("D:\\Anaconda3\\envs\\testEnviron\\lib");
//////        sys.path.add("D:\\Anaconda3\\envs\\testEnviron");
//////        sys.path.add("D:\\Anaconda3\\envs\\testEnviron\\lib\\site-packages");
//////        sys.path.add("D:\\PyCharm 2019.2\\helpers\\pycharm_matplotlib_backend");
//////        sys.path.add("C:\\Users\\X1\\Desktop\\fromGitHub\\eulerian-remote-heartrate-detection");
////        Process pr = Runtime.getRuntime().exec("cmd /c D:\\Anaconda3\\python.exe C:\\Users\\X1\\Desktop\\fromGitHub\\eulerian-remote-heartrate-detection\\test.py");
////        BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
////        String line;
////        String result = "";
////        while ((line = in.readLine()) != null) {
//////                line = decodeUnicode(line);
////            result += line;
////        }
////        in.close();
////        pr.waitFor();
////        System.out.println("the result is [" + result + "]");
////    }
//
//    public static void main(String args[]) throws IOException {
//        PythonInterpreter interpreter = new PythonInterpreter();
//        PySystemState sys = Py.getSystemState();
//        sys.path.add("D:\\PyCharm 2019.2\\helpers\\pydev");
//        sys.path.add("D:\\PyCharm 2019.2\\helpers\\pycharm_display");
//        sys.path.add("D:\\PyCharm 2019.2\\helpers\\third_party\\thriftpy");
//        sys.path.add("D:\\Anaconda3\\envs\\testEnviron\\python37.zip");
//        sys.path.add("D:\\Anaconda3\\envs\\testEnviron\\DLLs");
//        sys.path.add("D:\\Anaconda3\\envs\\testEnviron\\Lib");
//        sys.path.add("D:\\Anaconda3\\envs\\testEnviron");
//        sys.path.add("D:\\Anaconda3\\envs\\testEnviron\\Lib\\site-packages");
//        sys.path.add("D:\\PyCharm 2019.2\\helpers\\pycharm_matplotlib_backend");
//        sys.path.add("C:\\Users\\X1\\Desktop\\fromGitHub\\eulerian-remote-heartrate-detection");
//        sys.path.add("C:\\Users\\X1\\Desktop\\fromGitHub\\eulerian-remote-heartrate-detection");
//        sys.path.add("D:\\Anaconda3\\envs\\testEnviron\\Library\\include\\opencv2");
//        sys.path.add("D:\\Anaconda3\\envs\\testEnviron\\Library\\include");
////        interpreter.exec("path = \"D:\\Anaconda3\\envs\\testEnviron\\Lib\\site-packages\\numpy\"");
////        interpreter.exec("sys.path.append(path)");
//        System.out.println("the sys.path is :" + sys.path);
//        InputStream filepy = new FileInputStream("C:\\Users\\X1\\Desktop\\fromGitHub\\eulerian-remote-heartrate-detection\\test.py");
//        interpreter.execfile(filepy);
//        filepy.close();
//    }
//
//
//
//}