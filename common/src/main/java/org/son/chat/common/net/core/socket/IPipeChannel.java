package org.son.chat.common.net.core.socket;

/**
 * @author solq
 * */
public interface IPipeChannel<E extends IChannel> {

    /***
     * 加入管道
     * 
     * @param channelName
     *             管道名称
     * @param e
     *            元素
     * */
    void join(String channelName, E e);

    /**
     * 退出管道
     * 
     * @param e
     * */
    void eixt(E e);
    
    /***
     * 替换管道
     * 
     * @param newChannelName
     *             管道名称
     * @param e
     *            元素
     * */
    void replace(String newChannelName,E e);
}
