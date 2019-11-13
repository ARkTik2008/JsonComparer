import Entities.Message;
import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        JsonHelper jsonHelper = new JsonHelper();
        Gson gson = new Gson();
        ArrayList<Message> messages1 = new ArrayList<Message>();
        ArrayList<Message> messages2 = new ArrayList<Message>();


        String[] json1 = jsonHelper.getJsonFile("Activities1").split("\\n");
        String[] json2 = jsonHelper.getJsonFile("Activities2").split("\\n");

        //Check each message end
        ArrayList<String> invalidMessages2 = new ArrayList<String>();
        for (String line : json2) {
            if (!line.endsWith("}")) {
                invalidMessages2.add(line);
            }
        }

        //Print invalid messages
        for (String s : invalidMessages2) {
            System.out.println(s);
        }

        for (String line : json1) {
            if (line.endsWith("}")) {
                Message message = gson.fromJson(line, Message.class);
                messages1.add(message);
            }
        }

        for (String line : json2) {
            if (line.endsWith("}")) {
                Message message = gson.fromJson(line, Message.class);
                messages2.add(message);
            }
        }


        //check message Length in each files
        ArrayList<Message> differentLengthMessages = new ArrayList<Message>();

        long l1 = 0L;
        long l2 = 0L;

        for (Message m1 : messages1) {
            l1++;
            for (Message m2 : messages2) {
                if (m1.getReceivedAt().equals(m2.getReceivedAt()) && m1.getThreadId().equals(m2.getThreadId())) {
                    l2++;
                    if (m1.getLength() != m2.getLength()) {
                        differentLengthMessages.add(m1);
                        differentLengthMessages.add(m2);
                    }
                }
            }
        }

        //Print invalid messages id and length
        ArrayList<String> differentLengthMessagesId = new ArrayList<String>();

        for (Message m : differentLengthMessages) {
            differentLengthMessagesId.add(m.getMessageId());
        }

        for (String s : differentLengthMessagesId){
            System.out.println(s);
        }
    }
}
