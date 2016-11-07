/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koga.automobile.repository;

/**
 *
 * @param <T>
 */
public interface IDataResult<T> {
    public void onFail(String reason);
    public void onSucceed(T data);
}
