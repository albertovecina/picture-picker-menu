package com.zdev.picturepickermenu.view

/**
 * Created by Alberto Vecina Sánchez on 27/02/2019.
 */
interface PicturePickerView {

    fun showMenu()

    fun closeMenu()

    fun requestPictureFromCamera()

    fun requestPictureFromGallery()

}