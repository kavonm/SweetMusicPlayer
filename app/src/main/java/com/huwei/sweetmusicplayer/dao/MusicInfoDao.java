package com.huwei.sweetmusicplayer.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.huwei.sweetmusicplayer.business.models.MusicInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table MUSIC_INFO.
*/
public class MusicInfoDao extends AbstractDao<MusicInfo, Long> {

    public static final String TABLENAME = "MUSIC_INFO";

    /**
     * Properties of entity MusicInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property SongId = new Property(0, Long.class, "songId", true, "SONG_ID");
        public final static Property AlbumId = new Property(1, Long.class, "albumId", false, "ALBUM_ID");
        public final static Property ArtistId = new Property(2, Long.class, "artistId", false, "ARTIST_ID");
        public final static Property Title = new Property(3, String.class, "title", false, "TITLE");
        public final static Property Artist = new Property(4, String.class, "artist", false, "ARTIST");
        public final static Property Duration = new Property(5, Integer.class, "duration", false, "DURATION");
        public final static Property Path = new Property(6, String.class, "path", false, "PATH");
        public final static Property Favorite = new Property(7, Boolean.class, "favorite", false, "FAVORITE");
    };


    public MusicInfoDao(DaoConfig config) {
        super(config);
    }
    
    public MusicInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'MUSIC_INFO' (" + //
                "'SONG_ID' INTEGER PRIMARY KEY ," + // 0: songId
                "'ALBUM_ID' INTEGER," + // 1: albumId
                "'ARTIST_ID' INTEGER," + // 2: artistId
                "'TITLE' TEXT," + // 3: title
                "'ARTIST' TEXT," + // 4: artist
                "'DURATION' INTEGER," + // 5: duration
                "'PATH' TEXT," + // 6: path
                "'FAVORITE' INTEGER);"); // 7: favorite
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'MUSIC_INFO'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, MusicInfo entity) {
        stmt.clearBindings();
 
        Long songId = entity.getSongId();
        if (songId != null) {
            stmt.bindLong(1, songId);
        }
 
        Long albumId = entity.getAlbumId();
        if (albumId != null) {
            stmt.bindLong(2, albumId);
        }
 
        Long artistId = entity.getArtistId();
        if (artistId != null) {
            stmt.bindLong(3, artistId);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(4, title);
        }
 
        String artist = entity.getArtist();
        if (artist != null) {
            stmt.bindString(5, artist);
        }
 
        Integer duration = entity.getDuration();
        if (duration != null) {
            stmt.bindLong(6, duration);
        }
 
        String path = entity.getPath();
        if (path != null) {
            stmt.bindString(7, path);
        }
 
        Boolean favorite = entity.getFavorite();
        if (favorite != null) {
            stmt.bindLong(8, favorite ? 1l: 0l);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public MusicInfo readEntity(Cursor cursor, int offset) {
        MusicInfo entity = new MusicInfo( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // songId
            cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1), // albumId
            cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2), // artistId
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // title
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // artist
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // duration
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // path
            cursor.isNull(offset + 7) ? null : cursor.getShort(offset + 7) != 0 // favorite
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, MusicInfo entity, int offset) {
        entity.setSongId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setAlbumId(cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1));
        entity.setArtistId(cursor.isNull(offset + 2) ? null : cursor.getLong(offset + 2));
        entity.setTitle(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setArtist(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setDuration(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setPath(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setFavorite(cursor.isNull(offset + 7) ? null : cursor.getShort(offset + 7) != 0);
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(MusicInfo entity, long rowId) {
        entity.setSongId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(MusicInfo entity) {
        if(entity != null) {
            return entity.getSongId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}
