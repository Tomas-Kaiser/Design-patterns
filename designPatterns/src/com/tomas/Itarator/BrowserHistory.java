package com.tomas.Itarator;

public class BrowserHistory {
    private String[] urls = new String[5];
    private int count = 0;

    public void push(String url){
        urls[count++] = url;
    }

    public String pop(){
        int lastIndex = count;
        String lastUrl =  urls[lastIndex];
        urls[count--] = null;

        return lastUrl;
    }

    public Iterator createIterator() {
        return new ArrayIterator(this);
    }

    private class ArrayIterator implements Iterator {
        private int index;
        private BrowserHistory browserHistory;

        public ArrayIterator(BrowserHistory browserHistory){
            this.browserHistory = browserHistory;
        }


        @Override
        public boolean hasNext() {
            return (index < browserHistory.count);
        }

        @Override
        public String current() {
            return browserHistory.urls[index];
        }

        @Override
        public void next() {
            index++;
        }
    }
}
