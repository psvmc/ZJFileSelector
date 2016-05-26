package cn.psvmc.fileselector.util;

import java.text.DecimalFormat;

import cn.psvmc.fileselector.R;


public class FileHelper {

    /**
     * 根据文件名后缀返回图片资源id
     */
    public static int getImageBySuffix(String suffix) {
        int resource = R.drawable.ic_file_default;
        suffix = suffix.toLowerCase();
        if (suffix.equals("doc") || suffix.equals("docx")) {
            resource = R.drawable.ic_file_doc;
        } else if (suffix.equals("xls") || suffix.equals("xlsx")) {
            resource = R.drawable.ic_file_xls;
        } else if (suffix.equals("ppt") || suffix.equals("pptx")) {
            resource = R.drawable.ic_file_ppt;
        } else if (suffix.equals("png") || suffix.equals("jpg") || suffix.equals("jpeg") || suffix.equals("bmp")) {
            resource = R.drawable.ic_file_img;
        } else if (suffix.equals("pdf")) {
            resource = R.drawable.ic_file_pdf;
        } else if (suffix.equals("txt")) {
            resource = R.drawable.ic_file_txt;
        } else if (suffix.equals("zip") || suffix.equals("rar")) {
            resource = R.drawable.ic_file_rar;
        } else if (suffix.equals("dps")) {
            resource = R.drawable.ic_file_dps;
        } else if (suffix.equals("mp3") || suffix.equals("wav") || suffix.equals("ape") || suffix.equals("flac") || suffix.equals("wave") || suffix.equals("amr") || suffix.equals("aac") || suffix.equals("mid")) {
            resource = R.drawable.ic_file_music;
        } else if (suffix.equals("mp4") || suffix.equals("avi") || suffix.equals("rvmb") || suffix.equals("mkv") || suffix.equals("rm") || suffix.equals("mpg") || suffix.equals("3gp") || suffix.equals("vob") || suffix.equals("mpeg") || suffix.equals("mpg") || suffix.equals("mov") || suffix.equals("flv")) {
            resource = R.drawable.ic_file_video;
        } else if (suffix.equals("apk")) {
            resource = R.drawable.ic_file_apk;
        }
        return resource;
    }

    /**
     * 转换文件大小
     */
    public static String FormetFileSize(long size) {//转换文件大小
        DecimalFormat df = new DecimalFormat("#.00");
        String result = "";
        if (size < 1024) {
            result = df.format((double) size) + "B";
        } else if (size < 1048576) {
            result = df.format((double) size / 1024) + "K";
        } else if (size < 1073741824) {
            result = df.format((double) size / 1048576) + "M";
        } else {
            result = df.format((double) size / 1073741824) + "G";
        }
        return result;
    }

}
