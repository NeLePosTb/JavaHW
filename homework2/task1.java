public class Task1 {
    public static void main(String[] args) {
        String text = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"null\", \"age\":\"26\"}";
        String text1 = text.substring(1, text.length() - 1);
        String[] keyWithValue = text1.split(", ");
        StringBuilder res = new StringBuilder();
        boolean flag = true;

        for (String item : keyWithValue) {
            String[] keyValue = item.split(":" );
            String key = keyValue[0].replace("\"", ""); 
            String value = keyValue[1].replace("\"", ""); 
            if (!value.equalsIgnoreCase("null")) {
                if(flag==false)
                res.append(" AND ");
            res.append(key).append("=").append(value);
            flag = false; 
            }  
        }
        String sql = "SELECT * FROM students WHERE " + res.toString();
        System.out.println(sql);          
    }
}