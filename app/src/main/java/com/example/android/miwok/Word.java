package com.example.android.miwok;

public class Word {

    //** Default Translation for the word */
    private String mDefaultTranslation;

    //** Miwok Translation for the work */
    private String mMiwokTranslation;

    private int mImageResourceID = NO_IMAGE_PROVIDED;

    private int mAudioResourceID;

    private static final int NO_IMAGE_PROVIDED = -1;
    /**
    * Create a new Word object.
    *
    * @param defaultTranslation is the word in a language that the user is already familiar with
    *                           (such as English)
    * @param miwokTranslation is the word in the Miwok language
    * is the color of the category
    * @param audioResourceId is the audio resource ID for the image associated with the word
    */

    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceID = audioResourceId;
    }
    /** Create a new Word object.
    *
    * @param defaultTranslation is the word in a language that the user is already familiar with
    *                           (such as English)
    * @param miwokTranslation is the word in the Miwok language
    * @param imageResourceId is the drawable resource ID for the image associated with the word
    * @param audioResourceId is the audio resource ID for the image associated with the word
    */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageResourceId;
        mAudioResourceID = audioResourceId;

    }
    //** Get default translation of the word */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    //** Get Miwok translation of the word */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getImageResource() { return mImageResourceID;   }

    public int getAudioResource() { return mAudioResourceID;   }

    public boolean hasImage(){
            return mImageResourceID != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceID=" + mImageResourceID +
                ", mAudioResourceID=" + mAudioResourceID +
                '}';
    }
}
