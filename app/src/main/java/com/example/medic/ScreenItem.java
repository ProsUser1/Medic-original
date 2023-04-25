package com.example.medic;

public class ScreenItem {
        String title, description;
        int screenImg;

        public ScreenItem(String mainText, String description, int screenImg){
            this.title = mainText;
            this.description = description;
            this.screenImg = screenImg;

        }

        public void setDescription(String description) {
            this.description = description;
        }

        public void setMainText(String mainText) {
            this.title = mainText;
        }

        public void setScreenImg(int screenImg) {
            this.screenImg = screenImg;
        }

        public int getScreenImg() {
            return screenImg;
        }

        public String getDescription() {
            return description;
        }

        public String getMainText() {
            return title;
        }
}
