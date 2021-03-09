package pers.cyz.bigdatatool.uiservice.pojo;

import java.util.ArrayList;

public class ColonyObj {

    ArrayList<NodesMsgData> nodesMsgList;
    ArrayList<ComponentMsgData> componentMsgList;

    public ColonyObj(ArrayList<NodesMsgData> nodesMsgList, ArrayList<ComponentMsgData> componentMsgList) {
        this.nodesMsgList = nodesMsgList;
        this.componentMsgList = componentMsgList;
    }

    public ArrayList<NodesMsgData> getNodesMsgList() {
        return nodesMsgList;
    }

    public void setNodesMsgList(ArrayList<NodesMsgData> nodesMsgList) {
        this.nodesMsgList = nodesMsgList;
    }

    public ArrayList<ComponentMsgData> getComponentMsgList() {
        return componentMsgList;
    }

    public void setComponentMsgList(ArrayList<ComponentMsgData> componentMsgList) {
        this.componentMsgList = componentMsgList;
    }

    public static class NodesMsgData {
        String hostname;
        String ip;
        Boolean choose;

        public NodesMsgData(String hostname, String ip, Boolean choose) {
            this.hostname = hostname;
            this.ip = ip;
            this.choose = choose;
        }

        public String getHostname() {
            return hostname;
        }

        public void setHostname(String hostname) {
            this.hostname = hostname;
        }

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }

        public Boolean getChoose() {
            return choose;
        }

        public void setChoose(Boolean choose) {
            this.choose = choose;
        }

    }
    public static class ComponentMsgData{
        String name;
        String des;
        Boolean choose;
        ArrayList<String> version;

        public ComponentMsgData(String name, String des, Boolean choose, ArrayList<String> version) {
            this.name = name;
            this.des = des;
            this.choose = choose;
            this.version = version;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDes() {
            return des;
        }

        public void setDes(String des) {
            this.des = des;
        }

        public Boolean getChoose() {
            return choose;
        }

        public void setChoose(Boolean choose) {
            this.choose = choose;
        }

        public ArrayList<String> getVersion() {
            return version;
        }

        public void setVersion(ArrayList<String> version) {
            this.version = version;
        }
    }


}
